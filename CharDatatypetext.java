package bookcodes;
import java.util.Scanner;
public class CharDatatypetext {

	public static void main(String[] args) 
	{
		CharDatatypetext obj =new CharDatatypetext();
		obj.method1();
		
		

	}
	public void method1()
	{
		Scanner sc =new Scanner(System.in);
		char cr = sc.next().charAt(0);
		if(cr>='A'&&cr<='Z')
		{
			System.out.println(cr+" is a uppercase letter");
		}
		else if(cr>='a'&&cr<='z')
		{
			System.out.println(cr+" is a lowercase letter");
		}
		else if(cr>='0'&&cr<='9')
		{
			System.out.println(cr+" is a number");
		}
		
	}
	public void method()
	{
		char letter='a';
		char number ='1';
//		Mapping a character to its binary representation is called encoding.
//		There are different ways to encode a character. 
//		How characters are encoded is defined by an encoding scheme
//		You can use ASCII characters such as 'X' , '1' , and '$' in a Java program as well as
//		Unicodes. Thus, for example, the following statements are equivalent:
		char letter1 = 'a';
		char letter2 =\u0031;
		System.out.println(letter2);
		char character = \u0030;
		System.out.println("toprreamma\"");
//		(valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
	}

}
