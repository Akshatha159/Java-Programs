import java.util.Scanner;
public class TemperatureConvertor 
{
  public static void main(String[] args) 
  {
	  System.out.println("Welcome to the Temperature Conversion Tool!");
	  System.out.println("Select an option:");
	  System.out.println("1.Convert Celsius to Fahrenheit");
	   System.out.println(" 2.Convert Fahrenheit to Celsius"); 
	   Scanner scan=new Scanner(System.in);
		  int num=scan.nextInt();
	   System.out.println("Enter your choice:"+num);
	  if(num==1)
	  {
		  double celsius=scan.nextDouble();
		  System.out.println("Enter the temperature in Celsius:" +celsius);
		  double result1= celsiusToFahrenheit(celsius);
		  System.out.println ( celsius +  " C is equivalent to" + result1 +"F");
	  }
		 
	  else if(num==2)
	  {
		  double Fahrenheit=scan.nextDouble();
		  System.out.println("Enter the temperature in Fahrenheit:" +Fahrenheit);
		  double result2=(FahrenheitTocelsius(Fahrenheit));
		  System.out.println(Fahrenheit + " F is equivalent to "+ result2 +" C");
	  }
	}
	  public static double celsiusToFahrenheit(double celsius)
	  {
		  return (celsius *9/5) + 32;
	    }
	  public static double FahrenheitTocelsius(double Fahrenheit)
	    {
		 return (Fahrenheit - 32) *5/9;
	    }
  }

	  	  

