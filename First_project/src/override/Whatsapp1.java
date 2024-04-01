package override;

public class Whatsapp1 {
	
	public void message()
	{
		System.out.println("single tick");
	}

}
class Whatsapp2 extends Whatsapp1
{
	public void message()
	{
		super.message();
		System.out.println("double tick");
	}
	public void call()
	{
		System.out.println("video call");
	}
}
class Whatsapp3 extends Whatsapp2
{
	public void message()
	{
		super.message();
		System.out.println("blue tick");
		
	}
	public void call()
	{
		super.call();
		System.out.println("voice call");
	}
	
	public void story()
	{
		System.out.println("we can upload video");
	}
}
class Whatsapp4 extends Whatsapp3
{
	public void message()
	{
		super.message();
		System.out.println("ofline");
		
		
	}
	public void call()
	{
		super.call();
		System.out.println("both call");
	}
	public void story()
	{
		super.story();
		System.out.println("we can upload image");
	}
	public static void main(String args [])
	{
		Whatsapp4 w1=new Whatsapp4();
		w1.message();
		w1.call();
		w1.story();
	}
	
}

