package Static_b;

public class Static_Class2 {
	public static void add() //static method
	{
		System.out.println("call add method");
	}
	
	public static void sub()
	{
		System.out.println("call sub method");
	}
	
	public void display1()
	{
	System.out.println("Display1 method call")	;
	}
	public void display2()
	{
		System.out.println("Display2 method call");
	}
	class Static2
	{
	public static void main(String args[])
	{
		Static_Class2 obj2=new Static_Class2 ();
		obj2.display1();
		obj2.display2();
		Static_Class2.add();
		Static_Class2.sub();
	}
	
}
}
