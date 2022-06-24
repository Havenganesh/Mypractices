package tamilnadu.chennai;

public class CashBox {

	public static void main(String[] args) {
		int day =1;
		int box =0;
		/*while(day<=10)
		{
			int cash =day;
			day=day+1;
			box=box+cash;
			System.out.println("the day :" + day+" the cash in the box :"+box);
		}
         System.out.println("total collection :"+ box);
         box=box+box*2;
         System.out.println("dad offer claimed :"+ box);
	    }*/
	int result = 1; 
	int no = 0; 
	while(no<10)
	{
		no = no+1;
		result = result*no; 
		//result=result+1;
	     
	     System.out.println("the day :"+no+"the value is :"+result);
	}
	System.out.println(result); 

}}
