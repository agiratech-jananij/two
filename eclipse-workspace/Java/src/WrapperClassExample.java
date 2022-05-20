
public class WrapperClassExample {

	public static void main(String[] args) {
//// Converting int  into integer (Autoboxing)
//		int a = 40;
//		Integer  i =  Integer.valueOf(a);
//		Integer j = i;
//		System.out.println("The values are : "+ a +" "+ i+" "+j);
//// Converting integer to int  (Unboxing)
//		
//		Integer b = new Integer(6);
//		int k = b.intValue();
//		int l=b;
//		
//		System.out.println("The values are : " + b + " "+ k +" "+ l);
		
		String x = "xyz";
		x=x.toUpperCase();
		String y = x.replace('Y', 'y');
		y = y + "abc";
		System.out.println(y);
	}

}
