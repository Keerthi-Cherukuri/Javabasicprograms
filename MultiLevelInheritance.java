package basicsprogram;
class Class4
{
	static void div()
	{
		int a = 10;
	    int b = 5;
	    int c = a/b;
		System.out.println("Division of 2 numbers is "+c);
	}
	
}
class Class3 extends Class4
{
	 void add()
	{
		int a = 10;
	    int b = 5;
	    int c = a+b;
		System.out.println("Addition of 2 numbers is "+c);
	}
	
}
class Class2 extends Class3
{
	static void sub()
	{
		int a = 10;
	    int b = 5;
	    int c = a-b;
		System.out.println("Subtraction of 2 numbers is "+c);
	}
}
class Class1 extends Class2
{   
	 void multiply()
	{
		int a = 10;
	    int b = 5;
	    int c = a*b;
		System.out.println("Multiplication of 2 numbers is "+c);
	}
}
public class MultiLevelInheritance extends Class1 
{

	public static void main(String[] args)
	{
		MultiLevelInheritance m1 = new MultiLevelInheritance();
		m1.add();
		m1.multiply();
		sub();
		div();
		

	}

}
