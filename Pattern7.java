package loop;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern7 p7 =new Pattern7();
		p7.basic();
		p7.firststep();
		p7.last();

	}
	public void basic()
	{
		System.out.print(" ");System.out.print(" ");System.out.print(" ");System.out.print(" ");System.out.print(1+" ");
		System.out.println();
		System.out.print(" ");System.out.print(" ");System.out.print(" ");System.out.print(1+" ");System.out.print(2+" ");
		System.out.println();
		System.out.print(" ");System.out.print(" ");System.out.print(1+" ");System.out.print(2+" ");System.out.print(3+" ");
		System.out.println();
		System.out.print(" ");System.out.print(1+" ");System.out.print(2+" ");System.out.print(3+" ");System.out.print(4+" ");
		System.out.println();
		System.out.print(1+" ");System.out.print(2+" ");System.out.print(3+" ");System.out.print(4+" ");System.out.print(5+" ");
		System.out.println();
	}
	public void firststep()
	{
		for(int n=4;n>0;n--)
			System.out.print(" ");
		System.out.print(1+" ");
		System.out.println();
		for(int n=3;n>0;n--)
			System.out.print(" ");
		for(int n=1;n<=2;n++)
			System.out.print(n+" ");
		System.out.println();
		for(int n=2;n>0;n--)
			System.out.print(" ");
		for(int n=1;n<=3;n++)
			System.out.print(n+" ");
		System.out.println();
		for(int n=1;n>0;n--)
			System.out.print(" ");
		for(int n=1;n<=4;n++)
			System.out.print(n+" ");
		System.out.println();
		for(int n=0;n>0;n--)
			System.out.print(" ");
		for(int n=1;n<=5;n++)
			System.out.print(n+" ");
		System.out.println();
	}
	public void last()
	{
		for(int m=1;m<6;m++)
		{
			for(int n=5-m;n>0;n--)
				System.out.print(" ");
			for(int n=1;n<=m;n++)
				System.out.print(n+" ");
			System.out.println();
		}
		
	}

}
