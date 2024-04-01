package Abstract_Package;

public class Concrete extends Abstract
{
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("call add method");
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("call sub method");
		
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("call add method");
		
		
	}
	public static void main(String args[])
	{
		Concrete c1=new Concrete();
//		c1.dispaly();
//		c1.print();
//		c1.bike();
//		c1.car();
//		c1.college();
//		c1.school();
//		c1.student();
		c1.mul();
		c1.add();
		c1.sub();
	}

}
