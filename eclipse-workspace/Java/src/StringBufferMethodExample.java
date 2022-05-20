
public class StringBufferMethodExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Jana");
//USing append()
		sb.append("Janu");
		System.out.println("We using Append Method: " + sb);
//Using reverse()
		System.out.println("We using reverse method: " + sb.reverse());
//Using insert()
		sb.insert(4, "***");
		System.out.println("We USing Insert method: " + sb);
//Using toString()
		StringBuffer sa = new StringBuffer("Janani Jagadeesan");
		System.out.println("We USing TOstring: " +sa.toString());
	}

}
