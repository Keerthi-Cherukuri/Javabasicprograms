package basicsprogram;

public class IfElseIfBlock {

	public static void main(String[] args) 
	{
		int a = 100;
		int b = 200;
		int c = 300;
		if(a==b)
		{
			System.out.println("Condition 1");
		}
		else if(b==c)
		{
			System.out.println("condition 2");
		}
		
		else if(b!=c)
		{
			System.out.println("condition 4");
		}
		
		else
		{System.out.println("condition 3");}
	}

}
