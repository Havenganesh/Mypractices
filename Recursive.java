package loop;

public class Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursive rec = new Recursive();
		rec.meth(1);

	}

	public void meth(int a) {
		// TODO Auto-generated method stub
		int b = 1;
		int c = a+b;
		System.out.println(c);
		
		if(c<10)
		{
			meth(c);	
		}
		
	}
	

}
