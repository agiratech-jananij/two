
class NameRunnable extends Thread
{
	public void run()
	{
		System.out.println("NameRunnable running");
		System.out.println("Run by " + Thread.currentThread().getName());
	}
}

class NameRunnable1 extends Thread
{
	public void run()
	{
		System.out.println("It is Running");
		for(int i=0; i<=5; i++)
		{
			System.out.println("This is Extends of thread:" +i);
		}
	}
}
public class NameThread
{
	public static void main (String [] args) 
	{
		NameRunnable nr = new NameRunnable();
		Thread t = new Thread(nr);
//		t.setName("Fred");
		t.start();
		
		NameRunnable1 nr1 = new NameRunnable1();
		Thread t1 = new Thread(nr1);
		t1.start();
		 
		t.start();
		
		
		Class<? extends Thread> a =t.getClass();
		System.out.println("The Object:"+a.getName());
	}
}