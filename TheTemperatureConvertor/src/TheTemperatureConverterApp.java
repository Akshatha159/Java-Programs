import java.util.Scanner;
public class TheTemperatureConverterApp
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		System.out.println("enter a fahrenheit temperature to convert into celsius");
		double fahrenheit=scan.nextDouble();
		double fahrenheittocelsius=temperatureConverter.convertFahrenheitToCelsius(fahrenheit);
		System.out.println(fahrenheittocelsius);
	}
}