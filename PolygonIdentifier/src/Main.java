import java.util.Scanner;
public class Main
{
	public static void identifyPolygon(int sides)
	{

	switch (sides)
	{
	case 3:
		System.out.println("triangle");
	    break;
	case 4:
		System.out.println("qudrilateral");
	    break;
	case 5:
		System.out.println("pentagon");
	    break;
    case 6:
		System.out.println("hexagon");
	    break;
	default:
		System.out.println("polygon");
		break;
	}
}
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	int sides=scan.nextInt();
	identifyPolygon(sides);
	}
	}


