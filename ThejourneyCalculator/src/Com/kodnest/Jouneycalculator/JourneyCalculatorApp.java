package Com.kodnest.Jouneycalculator;
import java. util.Scanner;
public class JourneyCalculatorApp
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		JourneyCalculator journeyCalculator = new JourneyCalculator();
		System.out.println("enter the speed and time to calculate distance");
         double speed=scan.nextDouble();
		 double time=scan.nextDouble();
		 double distance=journeyCalculator.calculateDistance(speed,time);
		 System.out.println((distance));

		
	}
	
	
}