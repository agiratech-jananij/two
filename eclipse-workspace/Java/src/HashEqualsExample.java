
public class HashEqualsExample {

	public static void main(String[] args) {
		String a="20";
		String b="20";
		
		if(a.equals(b))
		{
			System.out.println("It is true");
			System.out.println(a.hashCode());
			System.out.println(b.hashCode());
		}
		
		String c="40";
		String d="30";
		if(!c.equals(d))
		{
			System.out.println("It is Working or not");
			System.out.println(c.hashCode());
			System.out.println(d.hashCode());
		}
//		String str = new String();
//		System.out.println(str.hashCode());
		
//	    int a = new int(20);
	    HashEqualsExample he = new HashEqualsExample();
	    System.out.println("Hashcode for Str :" + he.hashCode() );
	}

}
