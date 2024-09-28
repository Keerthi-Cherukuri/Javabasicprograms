package basicsprogram;

public class ConstructorOverLoading 
{
	ConstructorOverLoading()
	{
		System.out.println("Amazon");
	}
	
	ConstructorOverLoading(int a)
	{
		System.out.println("Flipkart");
	}
	ConstructorOverLoading(int a,int b)
	{
		System.out.println("2parameters");
	}
	
	public static void main(String[] args)
	{
		new ConstructorOverLoading();// Non Parameterized constructor

		new ConstructorOverLoading();// Non Parameterized constructor

		new ConstructorOverLoading(100);// Parameterized constructor
		new ConstructorOverLoading(100,20);// Parameterized constructor
	}

}
