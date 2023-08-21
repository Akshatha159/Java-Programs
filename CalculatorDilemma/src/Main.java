import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("enter the operator");
		String operator=scan.next();
		switch(operator)
		{
		case "+":
			System.out.println("Addition result is "+(num1+num2));
			break;
		case "-":
			System.out.println("Addition result is "+(num1+num2));
			break;
		case  "*":
			System.out.println("Addition result is "+(num1+num2));
			break;
		case "/":
			System.out.println("Addition result is "+(num1+num2));
			break;
			
		}
		
		
	}

}
