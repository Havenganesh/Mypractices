package loop;

public class Alphabetpattern2 {

	public static void main(String[] args) 
	{
		Alphabetpattern2 alpha = new Alphabetpattern2();
		alpha.alphaA();
		alpha.alphaAtE();
		alpha.test();
		alpha.firstloop();
		alpha.ok();
		
		

	}
	public void alphaA()
	{
		int letter =65;
		System.out.println((char)letter);
	}
	public void alphaAtE()
	{
		int letter = 65;
		while(letter<70)
		{
			System.out.print((char)letter);
			letter++;
		}
	}
	public void test()
	{
		int letter =65;
		System.out.print((char)letter);
		System.out.println();
		System.out.print((char)letter);System.out.print((char)(letter+1));
		System.out.println();
		System.out.print((char)letter);System.out.print((char)(letter+1));System.out.print((char)(letter+2));
		System.out.println();
		System.out.print((char)letter);System.out.print((char)(letter+1));System.out.print((char)(letter+2));System.out.print((char)(letter+3));
		System.out.println();
		System.out.print((char)letter);System.out.print((char)(letter+1));System.out.print((char)(letter+2));System.out.print((char)(letter+3));System.out.print((char)(letter+4));
		System.out.println();
	}
	public void firstloop()
	{
		int letter =65;
		System.out.print((char)letter);
		System.out.println();
		for(int n=0;n<=1;n++)
			System.out.print((char)(letter+n)+" ");
		System.out.println();
		for(int n=0;n<=2;n++)
			System.out.print((char)(letter+n)+" ");
		System.out.println();
		for(int n=0;n<=3;n++)
			System.out.print((char)(letter+n)+" ");
		System.out.println();
		for(int n=0;n<=4;n++)
			System.out.print((char)(letter+n)+" ");
		System.out.println();
		
	}
	public void ok()
	{ int letter=65;
		for(int m=0;m<5;m++)
		{
			for(int n=0;n<=m;n++)
				System.out.print((char)(letter+n)+" ");
			System.out.println();
		}
		
	}

}
