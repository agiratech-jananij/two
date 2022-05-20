//
//abstract class Example {
//	
//	abstract void add();
//	abstract void sub();
//	abstract void multi();
//}
//	
//public class AnonymousClassExample
//{
//	public static void main(String[] args) 
//	{
//		System.out.println("The Anonymous class using abstract methods");
//		Example e = new Example()
//				{
//	                  void add()
//	                  {
//			             System.out.println("The Addition Operation");
//			        	 int a,b,c;
//			        	 a=10;
//			        	 b=20;
//			        	 c=a+b;
//			        	 System.out.println("The Addition is" +c);
//	                  }
//	                  void sub()
//	                  {
//	                	  System.out.println("The Subtraction Operation");
//	                	  int d, e, f;
//	                	  d=40;
//	                	  e=20;
//	                	  f=d-e;
//	                	  System.out.println("The Subration value is"+ e);
//	                  }
//	                  void multi()
//	                  {
//	                	  System.out.println("The Multiplication Operation:");
//	                	  int g,h,i;
//	                	  g=20;
//	                	  h=2;
//	                	  i=g*h;
//	                	  System.out.println("The Multiplication value is: " +i);
//	                  }
//				};
//				e.add();
//				e.sub();
//				e.multi();
//	}
// }


// Using Interface
interface Example
{
	void display();
	void loop();
}
class AnonymousClassExample
{
	public static void main(String[] args)
	{
		
		Example e = new Example()
				{
					
					public void loop()
					{
						for(int i=0; i<=5;i++)
						{
							System.out.println("The value of for Loop"+i);
						}
						
					}
					public void display()
					{
						System.out.println("IT is an implementation function");
					}
				};
				
				e.display();
				e.loop();
	}
}