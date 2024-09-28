package basicsprogram;

import java.util.Scanner;

public class ScannerClass 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of age = ");
		int age =    s1.nextInt();
		
		//Scanner G1 = new Scanner(System.in);
		System.out.println("Enter the Gender  = ");
		String gender =    s1.next();

	}

}
