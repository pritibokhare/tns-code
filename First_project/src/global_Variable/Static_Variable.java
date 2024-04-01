package global_Variable;

public class Static_Variable {
	
	int a=10; ///non static veriable
	static int b=20; // static variable
	
	public void m1() //non static method define satic or non satic varible
	{
		int a=30;
		System.out.println("non static method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a);
	}
	public void m2()
	{
		
		System.out.println("non static method");
		System.out.println(a);
		System.out.println(b);
	}
	public  static void m3() ///satic method define only satic veriable 
	{
		
		System.out.println("static method");
		

		System.out.println(b);
	}
	public static void main(String args[])
	{
		Static_Variable s1=new Static_Variable();
		s1.m1();
		s1.m2();
		m3();
	}

}
