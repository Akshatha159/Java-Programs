import java.util.Scanner;
public class Main
{
	public static void getProduct(String productCode)
	{
		switch (productCode) 
		{
		case "Po":
			System.out.println("Cocacola");
			break;
		case "Co":
			System.out.println("Pepsi");
			break;
		case "Do":
			System.out.println("Fanta");
			break;
		case "Jo":
			System.out.println("JalJeera");
			break;
		case "Mo":
			System.out.println("MountainDew");
			break;
		case "Bo":
			System.out.println("BoatGuava");
			break;
		default:
			System.out.println("Panaka");
			break;
		}
	
	}
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the product");
		String productCode=scan.nextLine();
		getProduct(productCode);
	}
}


