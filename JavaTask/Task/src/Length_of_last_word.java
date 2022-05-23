
public class Length_of_last_word {
	
	public void  lastword(String s)
	{
		String s1 = s.trim();
		
		String  [] s2 =s1.split(" ");
		
		String lastword = s2[s2.length-1];
		
		int count= lastword.length();
		
		System.out.println("The last word of string:" +count);
	}

	public static void main(String[] args) {
		 
		Length_of_last_word l = new Length_of_last_word();
		l.lastword("Hello World");

	}

}
