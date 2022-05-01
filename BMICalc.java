package loop;
import java.util.Scanner;

public class BMICalc {

	public static void main(String[] args) {
		    try (Scanner input = new Scanner(System.in)) {
				System.out.println("enter your weight in kg");
				double weight = input.nextDouble();
				System.out.println("enter your Height in inches");
				double height = input.nextDouble();
				final double HEIGHT_METER = 0.0254;
				double height_Meter = height*HEIGHT_METER;
				double bmi = weight/(height_Meter*height_Meter);
				System.out.println("your bmi is "+bmi);
				if (bmi<18.5)
				{
					System.out.println("your under weight");
				}
				else if(bmi<25)
				{
					System.out.println("your normal");
				}
				else if(bmi<30)
				{
					System.out.println("your over weight");
				}
				else
				{
					System.out.println("obese");
				}
			}
		}

}
