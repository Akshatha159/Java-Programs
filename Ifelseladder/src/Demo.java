import java.util.Scanner;
public class Demo {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your age");
		int Score=scan.nextInt();
		DemoApp demo=new DemoApp();
		demo.grade(Score);
	
	}

}
