package bookcodes;
import java.util.Scanner;
public class StringandBook {

	public static void main(String[] args) 
	{
		StringandBook obj =new StringandBook();
//		obj.getStringLength();
//		obj.concatenating();
//		obj.converting();
		obj.line();

	}
	private void line() 
	{
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		String str1 = sc.nextLine();
		System.out.println(str1);
		System.out.println(str);
		
	}
	private void converting() 
	{
		String a="lowercase elleame okva";
		String b="UPPER CASE ELLEMAE OKVa";
		String c="kaLaNatHu KAlanThU";
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
		System.out.println(c.toLowerCase());
		System.out.println(c.toUpperCase());
		
	}
	private void concatenating() 
	{
		String sting ="number1 ";
		String sting1 ="number2 ";
		String join ="joins ";
		String str ="number3 ";
		String sting2 =sting.concat(sting1).concat(sting1);
		System.out.println(sting2);
		str = sting+join+sting1+join+str;
		System.out.println(str);
		str =sting+"nanum kooda varuven"+" appa nanum";
		System.out.println(str);
		
	}
	public void getStringLength()
	{
		String string1 ="Get string length";
		System.out.println(string1);
		System.out.println(string1.length());
		System.out.println(string1.charAt(2));
		System.out.println(string1.trim());
		for(int i=0;i<string1.length();i++)
		{
			System.out.println("the "+(i+1)+"letter : "+string1.charAt(i));
		}
	}
	public void method()
	{
		Scanner sc=new Scanner(System.in);
		double x1 =sc.nextDouble();
		double y1 =sc.nextDouble();
		double x2 =sc.nextDouble();
		double y2 =sc.nextDouble();
		double x3 =sc.nextDouble();
		double y3 =sc.nextDouble();
		double a = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
		double b = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
		double c = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		double A = Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*b*c)));
		double B = Math.toDegrees(Math.acos((b*b-a*a-c*c)/(-2*a*c)));
		double C = Math.toDegrees(Math.acos((c*c-b*b-a*a)/(-2*b*a)));
		System.out.println(Math.round(A*100)/100.0+","+Math.round(B*100)/100.0+","+Math.round(C*100)/100.0);
		System.out.println("check ");
		if(A+B+C==180)
			System.out.println("okay");
		System.out.println("it is a triangle");
		sc.close();
	}

}
