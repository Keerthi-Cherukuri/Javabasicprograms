package basicsprogram;
class one //super class
{
	static void add()
	{
		int a = 10;
	    int b = 5;
	    int c = a+b;
		System.out.println("Addition of 2 numbers is "+c);
	}
	static void sub()
	{
		int a = 10;
	    int b = 5;
	    int c = a-b;
		System.out.println("Subtraction of 2 numbers is "+c);
	}
	
}
public class SingleInheritanceStatic extends one //Subclass
{
	static void multiply()
	{
		int a = 10;
	    int b = 5;
	    int c = a*b;
		System.out.println("Multiplication of 2 numbers is "+c);
	}
	static void div()
	{
		int a = 10;
	    int b = 5;
	    int c = a/b;
		System.out.println("Division of 2 numbers is "+c);
	}

	public static void main(String[] args) 
	{
		add();
		sub();
		multiply();
		div();

	}

}
