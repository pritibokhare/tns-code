package this_super_keyword;

public class Method1 
{
int a=10;
int b=20;
}
 class child extends Method1
{
	int a=30;
	int b=40;
	public void m1()
	{
		int a=10;
		int b=20;
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
	System.out.println(this.b);
	System.out.println(super.a);
	System.out.println( super.b);
	}
	

public static void main(String args[])
{
	child c1=new child();
	c1.m1();
}
}