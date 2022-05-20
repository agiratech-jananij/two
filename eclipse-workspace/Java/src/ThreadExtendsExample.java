
public class ThreadExtendsExample extends Thread {
	public void run()
	{
		for(int i=0;i<=3;i++)
		{
			System.out.println("The Extends are:"+ i);
		}
		try
		{
			Thread.sleep(6000);
			number();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public  void number()
	{
		System.out.println("This is Private Thread");
		for(int i=0;i<3;i++)
		{
			System.out.println("The Child Thread is:"+i);
		}
	}
	public static void main(String[] args) {
		ThreadExtendsExample te = new ThreadExtendsExample();
		
		Thread t = new Thread(te);
//		Thread t1 = new Thread(te);
		
		t.start();
//		t1.start();
		System.out.println(t.activeCount());
		
	}
}
