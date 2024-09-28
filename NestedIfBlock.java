package basicsprogram;

import java.util.Scanner;

public class NestedIfBlock 
{

	public static void main(String[] args)
	{
		char gender1 = 'M';
		char gender2 = 'F';
		
		Scanner s1 = new Scanner(System.in);
		int ageofperson = s1.nextInt();
		
		if(gender1=='F')
		{
			if(ageofperson>=12)
			{
				System.out.println("Adult fare");
			}
			else
			{
			System.out.println("Half ticket");
			System.out.println("Free for female");
			}
		}
		
		else
		{
			System.out.println("Its free for Female");
		}
	}

}
