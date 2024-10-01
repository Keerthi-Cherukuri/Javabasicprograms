package basicsprogram;

class Super_Class { 
	void add()
	{
		int a = 20;
        int b = 10;
        int c = a+b;
    System.out.println("Addition of 2 numbers = "+c);
	}
	
	void sub()
	{
		int a = 20;
        int b = 10;
        int c = a-b;
    System.out.println("Subtraction of 2 numbers = "+c);
	}
	
	void multiply()
	{
		int a = 20;
        int b = 10;
        int c = a*b;
    System.out.println("Multiplication of 2 numbers = "+c);
	}
}


public class SingleInheritanceNonStatic extends Super_Class 
{
	 
		void div()
		{
			int a = 20;
	        int b = 10;
	        int c = a/b;
	    System.out.println("Division of 2 numbers = "+c);
		}
		
		void modulous()
		{
			int a = 20;
	        int b = 10;
	        int c = a%b;
	    System.out.println("Modulous of 2 numbers = "+c);
		}
	  

	public static void main(String[] args)  
      {
    	  SingleInheritanceNonStatic m1 = new SingleInheritanceNonStatic();
     	   m1.add();
   	       m1.sub();
    	   m1.multiply();
    	   m1.div();
    	   m1.modulous();
    	   
    	  
      }
}


