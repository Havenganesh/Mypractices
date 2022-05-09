package bookcodes;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int x= 30;
		int [] numbers = new int [x];
		x=60;
		System.out.println("the result : "+ x);
		System.out.println(numbers.length);*/
		int list[] = {1, 2, 3, 4, 5, 6};
		for (int i = 1; i < list.length; i++)
			{
			System.out.println(list[i]-list[i-1]);
			//list[i] = list[i - 1];
			}
			for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
		

	}

}
