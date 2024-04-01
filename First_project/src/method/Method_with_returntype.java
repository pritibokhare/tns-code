package method;

public class Method_with_returntype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Return());
		int x=Return();
		System.out.println(x);
		System.out.println(name());
		
	}
	public static int Return()
	{
		int a=20;
		int b=10;
		int c=a+b;
		return c;
	}
public static String name()
{
	String s="pune";
	return s;
}
}
