import java.util.Scanner;

public class TaxCalculator
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the purchase amount and tax rate");
		double PurchaseAmount=scan.nextDouble();
		double taxrate=scan.nextDouble();
		System.out.println(TotalWithTax(PurchaseAmount,taxrate));
	}
	public static double TotalWithTax(double PurchaseAmount,double taxrate)
	{
		 return ((PurchaseAmount*taxrate)+PurchaseAmount);
	}
}




