package inheritance;
//Multilevel inheritance
public class Multilevel_Inheritance 
{
	public void college()
	{
		System.out.println("welcome to APCOER college");
	}
	public void city()
	{
		System.out.println("pune");
	}
}
	 class Parent_Class extends Multilevel_Inheritance
	{
		public void bike()
		{
			System.out.println("called bike method");
		}
		public void car()
		{
			System.out.println("called car method");
		}
	}
	
		 class Child_Class1 extends Parent_Class
		{
			public void house  ()
			{
				System.out.println("called house method");
			}
			public void money()
			{
				System.out.println("called money method");
			}
		
	public static void main(String args[])
			{
				Child_Class1 obj1= new Child_Class1();
				
				obj1.college();
				obj1.city();
				obj1.bike();
				obj1.car();
				obj1.house();
				obj1.money();
			}
		}
		

			

