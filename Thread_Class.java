package basicsprogram;

public class Thread_Class 
{

	public static void main(String[] args) throws InterruptedException
	{
	    
		for(int i=1; i<=10; i++)
		{
      System.out.println(Math.random());
      Thread.sleep(2000);
  
		}
	}

}
