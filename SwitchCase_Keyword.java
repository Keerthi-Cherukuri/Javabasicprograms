package basicsprogram;

import java.util.Scanner;

public class SwitchCase_Keyword 
{
public static void main(String[] args) 
{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Please enter 1 for chrome");
	System.out.println("Please enter 2 for firefox");
	System.out.println("Please enter 3 for safari");
	System.out.println("Please enter 4 for edge");
	int input =   s1.nextInt();
	switch(input)
	{
		case 1 : System.out.println("Launching Chrome Browser");
		         break;
		case 2 : System.out.println("Launching safari Browser");
		         break;
		case 3 : System.out.println("Launching edge Browser");
		         break;
		case 4 : System.out.println("Launching firefox Browser");
		         break;
	    default : System.out.println("Launching default Browser"); 
	    
	}
	}}
