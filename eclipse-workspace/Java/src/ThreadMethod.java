public class ThreadMethod extends Thread  
{    
//run()
    public void run()  
    { 
    	for(int i=0;i<=3;i++) {
    		try
    		{
//sleep()
    			Thread.sleep(500);
    		}
    		catch(Exception e)
    		{
    			System.out.println(e);
    		}
    		System.out.println(i);
    	} 
//getname()
//Currentthread
        System.out.println(Thread.currentThread().getName());    
    }    
    public static void main(String args[])  
    {    
// creating two thread  
    	
    	ThreadMethod t1=new ThreadMethod();    
    	ThreadMethod t2=new ThreadMethod();    

    	ThreadMethod t3=new ThreadMethod();    
    	ThreadMethod t4=new ThreadMethod(); 
     
    	System.out.println("The Thread is alive or not:"+t1.isAlive());
//start()
        t1.start(); 
        try  
        {    
            t1.join(1500);    
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }  
//isAlive()
        System.out.println("The Thread is alive or not:"+t1.isAlive());
        t2.start(); 
        t3.start();
//Suspend()        
        t3.suspend();
        
        t4.start();
////setname()
        t4.setName("Janani Jagadeesan");
        t2.setName("Java Developer");
////resume()        
        t3.resume();
//setPriority()
        t2.setPriority(7);
        t4.setPriority(3);
        t3.setPriority(1);
//getPriority
        System.out.println("The Thread Priority:"+ t1.getPriority());
        System.out.println("The Thread Priority:"+ t2.getPriority());       
        System.out.println("The Thread Priority:"+ t3.getPriority());
        System.out.println("The Thread Priority:"+ t4.getPriority());
//stop()
      t1.stop();
        
        for(int i=0; i< 3;i ++)
        {
//yield()
        	t1.yield();
        	System.out.println(Thread.currentThread().getName()+" is Jana");
        }
//activecount()
        System.out.println("Number if active thread:"+ t1.activeCount());
    }    
}