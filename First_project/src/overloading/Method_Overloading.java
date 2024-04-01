package overloading;

public class Method_Overloading {
	
	public  void add(int a,float b)
	{
		System.out.println(a+b);
		
	}
	public  void add(int a,int b)
	{
		System.out.println(a+b);
		
	}
	public  void add(int a,float b,float c)
	{
		System.out.println(a+b+c);
	}
	public  void add(int a,int b,int c,int d)
	{
		System.out.println(a+b+b+c);
	}
	public  void add(int a,int b,float c,float d)
	{
		System.out.println(a+b+c+d);
	}
	public static void main(String args[])
	{
		Method_Overloading m1=new Method_Overloading();
		m1.add(5,10);
		m1.add(5,6);
        m1.add(5,10,5);
		m1.add(5,10,10,5);
		m1.add(5,10,20,8);
		
	}

}
