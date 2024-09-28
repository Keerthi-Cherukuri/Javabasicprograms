package basicsprogram;

public class GlobalVariable001 {
	
	static int  a= 10;
	static int b= 20;
	
	static void add()
	{
		int add = a+b;
		System.out.println("Global addition = "+add);
	}
	
	static void sub()
	{
		int sub = a-b;
		System.out.println("Global subtraction = "+sub);
	}
	
	static void multi()
	{
		int multi = a*b;
		System.out.println("Global multiplication = "+multi);
	}
	
	static void div()
	{
		int div = a/b;
		System.out.println("Global division = "+div);
	}
	
	static void modulus()
	{
		int modulus = a%b;
		System.out.println("Global modulus = "+modulus);
	}

	public static void main(String[] args) 
	{
		add();
		sub();
		multi();
		div();
		modulus();
		
		

	}

}
