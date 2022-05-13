package loop;
import java.util.Scanner;
public class Binary_find3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Binary_find3 num = new Binary_find3();
		System.out.println("please enter the binary num");
		int number = sc.nextInt();
		int result = num.binary(number);
		System.out.println("the out put "+result);
		sc.close();
	}
	public int binary(int input)
	{
		int inputc = input;
		String invert = "";
		int n =0;
		while(input>0)
		{
			int a = 0;
			a = input%10;
			input = input/10;
			invert = invert+a;
			n++;
		}
		System.out.println("the input value "+ inputc);
		System.out.println("the invert value " + invert );
		int newinput = Integer.valueOf(invert);
		int result = 0;
		int c = 0;
		while(n>0)
		{
			c=newinput%10;
			newinput=newinput/10;
			result=(result*2)+c;
			n--;
	
		}
		System.out.println("the deciaml value is "+ result);
		return result;
	}

}
