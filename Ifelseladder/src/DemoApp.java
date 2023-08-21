
public class DemoApp 
{
	public static void  grade( int Score)
        {
		if(Score>=90)
		{
			System.out.println("a");
        }
		else if (Score>=80&& Score<90)
		{
			System.out.println("b");
		}
		else if (Score>=70&& Score<80)
		{
			System.out.println("c");
		}
		else if (Score>=60&& Score<70)
		{
			System.out.println("d");
		}
		else if (Score>=50&& Score<60)
		{
			System.out.println("e");
		}
		else if (Score>=40&& Score<50)
		{
			System.out.println("f");
		}
		else
		{
			System.out.println("g");
		}
}
}
