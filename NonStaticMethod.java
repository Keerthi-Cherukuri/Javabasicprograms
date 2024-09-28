package basicsprogram;

public class NonStaticMethod 
{
	void addition()
	{
		
	System.out.println("Adding 2 numbers");
	
	}
   public static void substraction()
    {
		
    	System.out.println("Substraction 2 numbers");
    	
    }
	public static void main(String[] args) 
	{
		NonStaticMethod n1 = new NonStaticMethod();
		n1.addition();
		substraction();
		
		System.out.println("my main method");
		
	}

}
