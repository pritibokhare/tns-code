package inheritance;
//single inheritance
public class Single_Inheritance
{
	
	public void add(int a,int b)
	{
	
System.out.println("addition of ="+ (a+b));
		
	}
	public void sub(int a,int b)
	{
	
		System.out.println("substraction of ="+ (a-b));	
		
	}
	}
class Subclass extends Single_Inheritance
{
	public void mul(int a,int b)
	{
		
		System.out.println("multiplication of ="+ (a*b));
	
	
	}
	public void div(int a,int b)
	{
	
		System.out.println("division of ="+ (a/b));
	}
}
class Single1
{

	public static void main(String args[])
	{
		Subclass s1=new Subclass();
		s1.add(4, 5);
		s1.sub(10, 5);
		s1.mul(4, 6);
		s1.div(10,5);
	}
}