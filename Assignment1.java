package basicsprogram;
public class Assignment1
{
	static void addition()
	{
	int a = 10;
	int b= 20;
	int sum = a+b;
	
    System.out.println(sum);
	}
	 static void substraction()
	 {
		 int a = 10;
		 int b = 2;
		 int sub = a-b;
		 System.out.println(sub);
	 }
     
	 static void multiplication()
	 {
		 int a = 10;
		 int b = 2;
		 int multi = a*b;
		 System.out.println(multi);
	 }
	 
	 static void divide()
	 {
		 int a = 10;
		 int b = 2;
		 int divide = a/b;
		 System.out.println(divide);
	 }
	 
	 static void module()
	 {
		 int a = 6;
		 int b = 3;
		 int module = a%b;
		 System.out.println(module);
	 }
	 
	public static void main(String[] args)
	{
		System.out.print("The value for Addition = ");addition(); 
		System.out.print("The value for substraction = "); substraction();
		System.out.print("The value for multiplication = "); multiplication();
		System.out.print("The value for divide = "); divide();
        System.out.print("The value for module = "); module();
		
    }
	
 }
