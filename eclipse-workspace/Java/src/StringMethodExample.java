
public class StringMethodExample {

	public static void main(String[] args) {
//USing CharAt()
		String  a ="Janani";
		System.out.println("WE USing CharAt Methods: " + a.charAt(2));
//Using Concat()
		System.out.println("We Using Concat MEthods: " + a +" Jagadeesan");
//Using EqualsIgnoreCase()
		System.out.println("WE Using EqualIgnoreCase: " + a.equalsIgnoreCase("one"));
//USing Length()
		System.out.println("We Using Length Methods: " + a.length());
//Using replace()
		System.out.println("We USing Replace MEthods: " + a.replace("a", "d"));
//Using Substring()
		System.out.println("We using Substring MEthods:" + a.substring(2, 6));
		String b= "big suprise";
//Using tostring()	
		System.out.println("We using Tostring Methods: " + b.toString());
//using Uppercase()
		System.out.println("We using Uppercase MEthods: " + b.toUpperCase());
//Using LowerCase()
		System.out.println("We Using Lowercase Methods: " + a.toLowerCase());
//Using Trim()
		String c="            Janu   g      ";
		System.out.println("We using Trim Methods:" + c.trim());
	}

}
