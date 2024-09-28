package basicsprogram;

import java.util.Scanner;

public class ScannerProblems 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of PI = ");
		double pi = s1.nextDouble();
		
		
		Scanner r1 = new Scanner(System.in);
		System.out.println("Enter the value of r = ");
		double radius = r1. nextDouble();
		System.out.println("Area of Circle = "+pi*radius*radius);
		}

}
