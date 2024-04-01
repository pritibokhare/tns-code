package Atm_Miniproject;
import java.util.Scanner;
public class ATM_Machine 
{

	public static void main(String[] args)
	{
		int balance =100000,deposit,wamount;
		int pin=4545,newpin,otp=768668,mob_no=1234567893;
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome to Atm-Machine....");
	
		
		{
			while(true)
			{
			
		
		System.out.println("Welcome...");
		
		System.out.println("choose  1 for amount withdraw");
		System.out.println("choose 2 for amount deposited");
		System.out.println("choose 3 for check the balance");
		System.out.println("choose 4 for exit");
		System.out.println("choose 5 for generate pin");
		
        System.out.println("enter choice");
        int choice= s.nextInt();
        
        switch(choice)
        {
       
        case 1:
       System.out.println("enter amount to withdraw");
          wamount=s.nextInt();
          
         if(balance>=wamount)
         {
        	 
        	System.out.println("eneter your pin");
        	 pin=s.nextInt();
        	 if(pin==4545)
        	 {
        		 System.out.println("collect your money");
        		 balance=balance-wamount;
        	 }
        System.out.println("amount withdraw successfully");
         }
         else
         {
        	 System.out.println("amount not withdraw successfully  ");
         }
        break;
        
        case 2:
        	System.out.println("eneter your pin");
       	 pin=s.nextInt();
       	 if(pin==4545)
       	 {
        	System.out.println("enter amount to deposited");
         deposit= s.nextInt();
         balance=balance+deposit;
        	System.out.println("your amount successfully deposited");
        	System.out.println("your remaining balance="+balance);
       	 }
       	 
        break;
        case 3:
        	System.out.println("eneter your pin");
          	 pin=s.nextInt();
          	 if(pin==4545)
          	 {
        	System.out.println("check the balance");
        	System.out.println("Blance="+balance);
          	 }
        break;
        case 4:
        	
        System.exit(0);
        break;
        case 5:
        	System.out.println("enter the current pin...");
        	pin=s.nextInt();
          if(pin==4545)
          {
        	  System.out.println("enter mobile number");
        	  mob_no=s.nextInt();
        	  if(mob_no==1234567893)
        	  {
        		  System.out.println("enter otp");
        		  otp=s.nextInt();
        		  if(otp==768668)
        		  {
        			  System.out.println("enter new pin");
        			  newpin=s.nextInt();
        			  System.out.println("new pin generate successfully");
        		  }
        		  else
        		  {
        			  System.out.println("enter valid otp number");
        		  }
        	  }
        	  else
        	  {
        		  System.out.println("enter valid mob number"); 
        	  }
          }
          else
          {
        	  System.out.println("your current pin invalid");
          }
        	break;
        }
			}
			
		}
	}
}
        	


	

	


