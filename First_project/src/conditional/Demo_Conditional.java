package conditional;

public class Demo_Conditional {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int marks=105;
		if(marks>=90&&marks<=100)
		{
			System.out.println("topper");
		}
		else if(marks>=75&&marks<=90)
		{
			System.out.println("distinction");
		}
		else if(marks>=65&&marks<=80)
		{
			System.out.println("first class");
		}
		else if(marks>=40&&marks<=60)
		{
			System.out.println("second class");
		}
		else if(marks>=101)
		{
			System.out.println("invalid");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
