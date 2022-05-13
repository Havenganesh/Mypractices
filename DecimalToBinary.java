package loop;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) 
	{
		DecimalToBinary obj = new DecimalToBinary();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter any binary number");
		int input =sc.nextInt();
		int result = 0;
		int rem=input%10;
		int po =0;
		sc.close();
		while(input>0)
		{
			result=result+(rem*obj.power_find(2,po));
			input = input/10;
			rem = input%10;
			po++;
		}
		System.out.println(result);	
	}
	public void cake()
	{
		int cake = 14;
		int cake1 = cake;
		String binary = "";
		while(cake>0)
		{
			int rem = cake%2;
			binary = rem+binary;
			cake=cake/2;
		}
		System.out.println("the binary of "+cake1+" is "+binary);
	}
    public int power_find(int no,int power)
    {
    	int result = 1;
    	while(power>0)
    	{
    		result = result*no;
    		power--;
    	}
    	return result;
    }
}
