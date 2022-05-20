class outer 
{
	private static void display()
	{
		System.out.println("Inner static Methods");
	}
	
	static class inner
	{
		public static void people()
		{
			System.out.println("Inner Inside Static Methods");
			display();
		}
	}
}
public class StaticExample
{
	public static void main(String[] args)
	{
		outer.inner one = new outer.inner();
		
		one.people();

	}

}


//class StaticExample{  
//  static int data=30;  
//  static class Inner{  
//   void msg(){System.out.println("data is "+data);}  
//  }  
//  public static void main(String args[]){  
//  StaticExample.Inner obj=new StaticExample.Inner();  
//  obj.msg();  
//  }  
//}  
