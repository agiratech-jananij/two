public class OperatorsExample {

	public static void main(String[] args) {
//Arithmetic Operators
		int a =5,b=6,c=8;
		System.out.println("Addition Operators:"+ (a + b));
		System.out.println("Subtraction Operators:"+ (a - b));
		System.out.println("Multiplication Operators:"+ (a * b));
		System.out.println("Division Operators:"+ (a / b));
		System.out.println("Modolues Operators:"+ (a % b)+"\n");
		
//Assignment Operators
		int one;
		
		System.out.println("The Assignment Operators:"+ (one=a));
		System.out.println("Assignment Addition Operators:"+ (one += a));
		System.out.println("Assignment Subtraction Operators:"+ (one -= a));
		System.out.println("Assignment Multiplication Operators:"+(one *= a));
		System.out.println("Assignment Division Operators:"+ (one /= a));
		System.out.println("Assignment Modolues Operators:"+(one %= a)+"\n");
		
//Relational Operators
		
		System.out.println("The Relational Operators \n");
		System.out.println("The Equal to Operators:" + (a==b));
		System.out.println("The Not Equal to Operators:" + (a!=b));
		System.out.println("The Lesser than Operators:" +(a < b));
		System.out.println("The Lesser than Equal to Operators:" +(a <= b));
		System.out.println("The Greater than Operators:" +(a > b));
		System.out.println("The Greater than Equal to  Operators:" +(a >= b)+"\n");
		
//Logical Operators
		System.out.println("The Logical Operators \n");
		System.out.println("The AND Operators:"+((a>b) && (b<c)));
		System.out.println("The OR Operators:"+((a>=b) || (b<c)));
		System.out.println("The NOT Operators:"+(!(a==b))+"\n");
		
//Unary Operators
		System.out.println("The Unary operators \n");
		System.out.println("Plus Post Increment:" +(a++));
		System.out.println("Minus Post decrement:" +(b--));	
		System.out.println("Plus Pre Increment:" +(++c));
		System.out.println("Plus Pre decrement:" +(--b)+"\n");
		
//Bitwise Operators
		System.out.println("The Bitwise Operators \n");
		System.out.println("The Bitwise AND Operators:" +(a & b));
		System.out.println("The Bitwise OR Operators:" + (a | b));
		System.out.println("The Bitwise XOR Operators:" + (a ^ b));
		System.out.println("Bitwise Complement Operators:" + (~ b)+"\n");
//		System.out.println("Left shift Operators:" + (a << 2));
//		System.out.println("Right Shift Operators:" + (b >> 2));
//		System.out.println("Unsigned Right Shift Operators:" + (c >>> 2)+"\n");

//Instanceof Operators
		String str="Prgoramming";
		boolean res;
		res = str instanceof String;
		System.out.println("The Instance of Operator:" +res);
		
//Ternary Operators
		int age=18;
		String  result;
		result=(age>= 18) ? "Eligible to Vote" : "Not Eligible to vote";
		System.out.println("The Ternary Operators:" + result);



	}

}
