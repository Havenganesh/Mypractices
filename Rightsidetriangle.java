package loop;

public class Rightsidetriangle {

	public static void main(String[] args) 
	{
		Rightsidetriangle rt =new Rightsidetriangle();
		//rt.firststep();
		rt.secondstep();
		rt.last();
		
		
	}
	
	public void basic()
	 {
	 System.out.print("  ");System.out.print("  ");System.out.print("  ");System.out.print("  ");System.out.print(" *");
	 System.out.println();
	 System.out.print("  ");System.out.print("  ");System.out.print("  ");System.out.print(" *");System.out.print(" *");
	 System.out.println();
	 System.out.print("  ");System.out.print("  ");System.out.print(" *");System.out.print(" *");System.out.print(" *");
	 System.out.println();
	 System.out.print("  ");System.out.print(" *");System.out.print(" *");System.out.print(" *");System.out.print(" *");
	 System.out.println();
	 System.out.print(" *");System.out.print(" *");System.out.print(" *");System.out.print(" *");System.out.print(" *");
	 System.out.println();
    }
		
	
	public void firststep()
	{
		for(int n=0;n<4;n++)
			System.out.print("  ");
		System.out.print(" *");
		System.out.println();
		for(int n=0;n<3;n++)
			System.out.print("  ");
		for(int n=0;n<2;n++)
			System.out.print(" *");
		System.out.println();
		for(int n=0;n<2;n++)
			System.out.print("  ");
		for(int n=0;n<3;n++)
			System.out.print(" *");
		System.out.println();
		for(int n=0;n<1;n++)
			System.out.print("  ");
		for(int n=0;n<4;n++)
			System.out.print(" *");
		System.out.println();
		for(int n=0;n<0;n++)
			System.out.print("  ");
		for(int n=0;n<5;n++)
			System.out.print(" *");
		System.out.println();	
	}
	public void secondstep()
	{
		int i=0;
		for(int m=1;m<=5;m++)
		{
			for(int n=i;n<4;n++)
				System.out.print("  ");
			for(int n=0;n<m;n++)
				System.out.print(" *");
			System.out.println();
		   i++;
		}
		
	}
	public void last()
	{
		for(int m=1;m<=5;m++)
		{
			for(int n=m-5;n<0;n++)
				System.out.print("  ");
			for(int n=0;n<m;n++)
				System.out.print(" *");
			System.out.println();
		}
		
	}

}
