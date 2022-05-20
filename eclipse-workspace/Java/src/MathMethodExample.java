//Math class are defined as static, you don’t need to
//create an instance to use them. In fact, it’s not possible to create an instance of the
//Math class because the constructor is private. You can’t extend the Math class
//either, because it’s marked final.




public class MathMethodExample {

	public static void main(String[] args) {
//Using abs() [absolute value]
		double a=Math.abs(-22.5);
		System.out.println("We using absolute value:" + a);

//Using Ceil()
		double y = Math.ceil(8.8);
		System.out.println("We using Ceil Methods: " + y );
//Using floor()
		double z = Math.floor(9.5);
		System.out.println("We using Floor Methods: " +z);
//USing max()
		int  j = Math.max(2000, 6666);
		System.out.println("We using max methods: " + j);
//USing min()
		int  k = Math.min(2000, 6666);
		System.out.println("We using max methods: " + k);
//Using random()
		for (int x=0; x < 5; x++)
		{
			System.out.println("We using random methods:"+ (int)(Math.random()*10) + " " );
		}
//Using round()
		double b = Math.round(66.52);
		System.out.println("WE Using round methods: " + b);
		
//Using Sin()
		double h= 90;
		double l= Math.toRadians(h);
		System.out.println("We using sin Methods: " + Math.sin(l));
//Using cos()
		System.out.println("We using cos Methods: " + Math.cos(l));
//USing tan()
		System.out.println("We using tan Methods: " + Math.tan(l));
//USing sqrt()
		double g=64.0;
		System.out.println("We using sqrt Methods: " + Math.sqrt(g));
//Using todegress()
		double f = (Math.PI);
		System.out.println("WE using toDegress Methods:" + Math.toDegrees(f));
//USing toradians()
		double e = 180.0;
		System.out.println("We using ToRadians MEthods: " + Math.toRadians(e));
	}

}


//class MathMethodExample
//{
//	public static void main(String [] argh)
//{
//		double [] num = {10.5, -10.5, Math.PI, 0};
//		for(int i=0;i<num.length;++i) 
//		{
//			System.out.println("abs("+num[i]+")="+Math.abs(num[i]));
//			System.out.println("ceil("+num[i]+")="+Math.ceil(num[i]));
//			System.out.println("floor("+num[i]+")="+Math.floor(num[i]));
//			System.out.println();
//		}
//}
//}