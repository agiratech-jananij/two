public class MemberInnerClassExample {
	
	int d =150;
	
	class inner
	{
		void display()
		{
			System.out.println("Data is :" + d);
			
			for(int i=0;i<=5;i++)
			{
				System.out.println("The value for loop:" +i);
			}
		}
	}

	public static void main(String[] args) {
		
		MemberInnerClassExample mi = new MemberInnerClassExample();
		
		MemberInnerClassExample.inner i = mi.new inner();
		
		i.display();

	}

}
