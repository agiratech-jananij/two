
public class LocalInnerClassExample {
	void display()
	{
		System.out.println("This is outer class");
		
		for(int i=0; i<=5;i++)
		{
			System.out.println("The Outer class run by:" + i);
		}
		
		class inner
		{
			void play()
			{
				System.out.println("This is Inner class");
				
				int a=10;
				int n=20;
				int c=a+n;
				System.out.println("The value of a and n:"+c);
			}
		}
		
		inner i = new inner();
		i.play();
	}
	
	public static void main(String[] args) {
		LocalInnerClassExample ic = new LocalInnerClassExample();
		ic.display();

	}

}
