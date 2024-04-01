package inheritance;

 class Cat extends Hierarchical_Inheritance 
{
	public void meow()
	{
		
		System.out.println("meowing");
		}
	
	
	public static void main(String args[])
	{
		Cat c1=new Cat();
		c1.eat();
		c1.meow();
		
		
	}
}


