package basicsprogram;

public class OperatorsProgram {
	
	static void addition ()
	
	{
		int a = 100;
		int b = 250;
		int sum = a+b;
		
		System.out.println("The addition of a & b is" +sum);
	}
	
     static void substraction ()
	
	{
		int a = 100;
		int b = 250;
		int sub = a-b;
		
		System.out.println("The addition of a & b is" +sub);
	}
    
     static void multiplication ()
 	
 	{
 		int a = 100;
 		int b = 250;
 		int multi = a*b;
 		
 		System.out.println("The addition of a & b is" +multi);
 	}
     
    // Returns quotient
     static void divide ()
  	
  	{
  		int a = 100;
  		int b = 250;
  		int divide = a/b;
  		
  		System.out.println("The addition of a & b is" +divide);
  	}
     
     static void modulous ()
   	
   	{
   		int a = 100;
   		int b = 250;
   		int modulous = a%b;
   		
   		System.out.println("The addition of a & b is" +modulous);
   	}
	public static void main(String[] args)
	{
	
		addition ();
		substraction ();
		multiplication ();
		divide ();
		modulous ();
		

	}

}
