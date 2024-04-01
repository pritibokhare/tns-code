package Static_p;
import Static_b.Static_Class2 ;
public class Static_Class1 {
	
	public static void A()
	{
		System.out.println("call A method");
	}
	
	
	public static void 	B()
	{
		System.out.println("call B method");
	}
	public void display()
	{
		System.out.println("call display");
	}
	public static void main(String args[])
	{
		Static_Class1 ob1=new Static_Class1();
		Static_Class2 ob2=new Static_Class2();
		ob1.display();
		ob1.A();
		ob2.display1();
		ob2.display2();

		Static_Class2.add();
		Static_Class2.sub();
		
		A();
		B();
	}
	

}
