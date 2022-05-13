package loop;

public class Sum_of_digits 
{

	
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			Sum_of_digits ld = new Sum_of_digits(); 
			int no = 9871; //
			//ld.calculate_sum_of_digits(no); 
			ld.fibanocci();
			//if(result>9)
			//{
			//ld.calculate_sum_of_digits(result); 
			//}
		}

		public void fibanocci() {
			// TODO Auto-generated method stub
			int first=-1, second = 1; 
			int third = 0; 
			while(third<13)
			{
			third = first+second; 
			System.out.println(third); 
			first = second; 
			second = third; 
			}
			
		} 
			
		

		/*private int calculate_sum_of_digits(int no)
		{
			int sum_of_digits = 0; 
			while(no>0)
			{
			sum_of_digits = sum_of_digits + (no%10); 
			no = no/10; 
			}
			System.out.println(sum_of_digits); return sum_of_digits; 
		} */
		public void calculate_sum_of_digits(int no)
		{
		int sum_of_digits = 0; 
		while(no>0)
		{
		sum_of_digits = sum_of_digits + (no%10); 
		no = no/10; 
		}
		System.out.println(sum_of_digits); 
		if(sum_of_digits>9)
			{
			int result =sum_of_digits;
		    calculate_sum_of_digits(result); 
			}
		} 
}

