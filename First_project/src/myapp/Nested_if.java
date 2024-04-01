package myapp;

public class Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int girl_age=16;
	    int lacourt_marr=18;
	    int jenage =18;
	    int jecourt_marr=20;
		
		if(girl_age>=17)
		{
			System.out.println("ladies are eligible for vote");
			
		
		if(lacourt_marr>=18)
		{
			System.out.println("she can marriage");
			}
		else
		{
			System.out.println("jence are not eligible for vote");
		}
       }
	else
	 {
		System.out.println("ladies are not eligible for vote");
	}
	

		
	if(jenage>=18)
	{
		System.out.println("jence are eligible for vote");
		
	
	if(jecourt_marr>=21)
	{
		System.out.println("he can marriage");
		}
	else
	{
		System.out.println("jence are not eligible for marriage");
	}
   }
else
 {
	System.out.println("jence are not eligible for vote");
}
}
}

