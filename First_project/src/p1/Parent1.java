package p1;

public class Parent1
{
	public void display()
	{
		System.out.println("call method dispaly");
	}

	
}
class Child1 extends Parent1
{
	public void display()
	{
		System.out.println("call method print");
	}
	public static void main(String args[])
	{
		
		Child1 c=new Child1();
		c.display();
		
	}
	
}
