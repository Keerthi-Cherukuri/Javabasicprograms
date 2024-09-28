package basicsprogram;

import java.util.Scanner;

public class IfElseBlock
{

	public static void main(String[] args)
	
	{
		Scanner s1 = new Scanner(System.in);
		int age = s1.nextInt();
		
		
		if(age>=18)
		{ 
			System.out.println("Eligible for vote");
		}
		else
		{
			System.out.println("Not eligible for vote");
		}
	    }

}
