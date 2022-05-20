
public class GarbageCollectionExample {
	
	public void finalize()
	{
		System.out.println("This is Garbage Collection");
	}
	
	public static void main(String[] args) 
	{
		GarbageCollectionExample g1 = new GarbageCollectionExample();
		
		GarbageCollectionExample g2 = new GarbageCollectionExample();
		
//		Bu Nulling reference
//		g1=null;
//		g2=null;
		
		
		
// By assigning reference to another objects.
//		g1=g2;
		
		
		
// Anonymous Objects
		new GarbageCollectionExample();
		new GarbageCollectionExample();
		
		
		System.gc();
	}
}