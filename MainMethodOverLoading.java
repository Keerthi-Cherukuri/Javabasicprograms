package basicsprogram;

public class MainMethodOverLoading
{

	public static void main(String[] args)//Mainmethod
	{
		System.out.println("main method");
		//main();//Calling another main method by its name
		main("Keerthi",'F' );
		MainMethodOverLoading m1 = new MainMethodOverLoading();
		m1.main();
	}
	public  void main()
	{
		System.out.println("No argument");

	}
	public static void main(String name, char gender)
	{
		System.out.println("Main method with argument as string and gender "+"keerthi");
		System.out.println('F');
		
		

	}
}
