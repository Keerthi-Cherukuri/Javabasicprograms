package basicsprogram;

public class GlobalVariable 
{
    static int a = 100; // Global variable
    int c = 10;// Global variable
    int b= 90;
	public static void main(String[] args) 
	{
		GlobalVariable g1 = new GlobalVariable();
	    g1. b = 7;//Updating value of global variable byt using reference  variable
		System.out.println(g1.b);

	}

}
