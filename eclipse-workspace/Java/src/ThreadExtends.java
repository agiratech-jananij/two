
//public class ThreadExtends extends Thread {
//	public void run()
//	{
//		System.out.println("This is a Child Thread");
//	}
//	public static void main(String[] args) {
//		System.out.println("This is main method");
//		
//		ThreadExtends th = new ThreadExtends();
//		
//		Thread t = new Thread(th);
//		
//		t.start();
//	}
//}



public class ThreadExtends extends Thread {
public 	void run()
{
   Thread th1 = Thread.currentThread();
	System.out.println(th1); 
  System.out.println("New thread starts running");
  System.out.println("I am in run() method");
}
public static void main(String[] args)
{
 System.out.println("Main thread starts running");	
 Thread ct1 = Thread.currentThread();
 System.out.println(ct1);
 
  int ac1 = Thread.activeCount();
  System.out.println("One is:"+ac1);  

// Create an object of NewThread class.
  ThreadExtends nt = new ThreadExtends();
   int ac2 = Thread.activeCount();
   System.out.println("Two is:"+ ac2);

// Create an object of Thread class and pass the object reference variable nt.
   Thread t = new Thread(nt);
   int ac3 = Thread.activeCount();
   System.out.println("Three is:" +ac3);

// Now run thread on the object. For this, call start() method using reference variable t.
  t.start(); // This thread will execute statements inside run() method of NewThread object.
   int ac4 = Thread.activeCount();
   System.out.println("Four is:" +ac4);
  t.setName("NewThread");
  t.setName("oneThread");
  // Setting a new name of thread.
 }
}
