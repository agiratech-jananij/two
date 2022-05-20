
class SyncExample implements Runnable 
{

	@Override
	public void run() 
	{
		display();
		System.out.println("The Run Method");
		try 
		{
			Thread.sleep(3000);
			for(int i=0;i<=5;i++)
			{
				System.out.println("The Value of for loop"+i);
			}
		}
		catch(Exception e)
		{
			System.out.println("Unusual Erros");
		}
		
	}
		synchronized static   void display()
		{
			int a,b,c;
			System.out.println("The Addition Operation");
				try
				{
					a=10;
					b=20;
					c=a+b;
					System.out.println("The Value of Add" + c);
				}
				catch(Exception e)
				{
					System.out.println("UnWanted Error");
				}
		}
	public static void main (String [] args)
	{
		SyncExample se = new SyncExample();
		Thread t = new Thread(se);
		Thread t1 = new Thread(se);
		
		t.start();
		t1.start();
	}

}

