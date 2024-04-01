package inheritance;

public class Grant_Parent extends Parent 
{
	
	public void add()
	{
	
	super.sub();
		System.out.println("called method add");
	}
}
class Parent
{
	public void sub()
	{
	System.out.println("called method sub");
}
}
class Child extends Grant_Parent
	{
	public static void main(String args[])
	{
		Child c1=new Child();
		c1.add();
		
		
	}
}
