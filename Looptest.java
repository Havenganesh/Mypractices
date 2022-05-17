package loop;

public class Looptest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Looptest lt =new Looptest();
		//lt.basic();
		//lt.Firstloop();
		//lt.forloop();
		//lt.nextstep();
		lt.starloop();
	}
	public void basic()
	{
		System.out.print(1);
		System.out.println();
		System.out.print(1+" ");System.out.print(2+" ");
		System.out.println();
		System.out.print(1+" ");System.out.print(2+" ");System.out.print(3);
		System.out.println();
		System.out.print(1+" ");System.out.print(2+" ");System.out.print(3+" ");System.out.print(4);
		System.out.println();
		System.out.print(1+" ");System.out.print(2+" ");System.out.print(3+" ");System.out.print(4+" ");System.out.print(5);
		System.out.println();
	}
	/*conversion
	 * System.out.print(1+" ");System.out.print(2+" ");
	 *two times print the value
	 *int n=1;
	 *while(n<=2){             |for(int n=1;n<=2;n++){
	 *system.out.print(n);     |system.out.print(n)
	 *n++;}                    |}
	 * 
	 * */
	public void Firstloop()
	{
		System.out.print(1);
		System.out.println();  //1
		for(int n=1;n<=2;n++)
			System.out.print(n+" ");
		System.out.println();  //2
		for(int n=1;n<=3;n++)
			System.out.print(n+" ");
		System.out.println();  //3
		for(int n=1;n<=4;n++)
			System.out.print(n+" ");
		System.out.println();  //4
		for(int n=1;n<=5;n++)
			System.out.print(n+" ");
		System.out.println();	//5
	}
	public void nextstep()
	{   int m =1;
		while(m<=5) 
		{
		  for(int n=1;n<=m;n++)
		  {
		    System.out.print(n+" ");
		  }
		  System.out.println();
		  m++;
	    }
	}
	public void forloop()
	{
		for(int n=1;n<=5;n++)
		{
	        for (int m =1;m<=n;m++)
			{
				System.out.print(m+" ");
			}
	        System.out.println();
		}
		
	}
	public void starloop()
	{
		for(int n=1;n<=5;n++)
		{
	        for (int m =1;m<=n;m++)
			{
				System.out.print("* ");
			}
	        System.out.println();
		}
		
	}

}
