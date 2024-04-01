package override;

public class Laptop3 extends Laptop2 {

	
	 public void version()
	 {
		 super.version();
		 System.out.println("windows 11");
		 
	 }
	 public void ram()
	 {
		 super.ram();
		 System.out.println(" 128 gb");
	 }
	 public void disk()
	 {
		 super.disk();
		 System.out.println("ssd");
	 }
	 

public static void main(String args [])
{
	Laptop3 l1=new Laptop3();
	l1.version();
	l1.ram();
	l1.disk();
}
}
