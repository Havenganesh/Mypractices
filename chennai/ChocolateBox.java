package tamilnadu.chennai;

public class ChocolateBox 
{

	public static void main(String[] args) 
	{ 
		int no_of_times = 3;
		int box = 8;
		
		while(no_of_times>0)
           {
		   System.out.println("after dinner "+ box);
           box = (box +box/2);
           no_of_times = no_of_times-1;
		   }
    System.out.println(box);
	} 

}
