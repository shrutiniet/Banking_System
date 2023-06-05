package Banking_Simple;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		Account Test=new Account("Shruti", 1200000.0, "1215", "shruti1215@gmail.com","9876543210");		
		Boolean Value=true;
		while(Value)
		{
			System.out.println("Press 1 for User Data");
			System.out.println("Press 2 for Deposit Money");
			System.out.println("Press 3 for Withdraw Money");
			System.out.println("Press 4 for exit");
			int input=sc.nextInt();
			if(input==1)
			{
				Test.Info();
			}
			else if(input==2)
			{
				System.out.println("Enter the amount to be deposit");
				Double money=sc.nextDouble();
				Test.Deposit_Money(money);
			}
			else if(input==3)
			{
				System.out.println("Enter the amount to withdraw");
				Double amount=sc.nextDouble();
				Test.Withdraw(amount);
			}
			else if(input==4)
			{
				Value=false;
			}
			else
			{
				System.out.println("Invalid Choice");
			}
		}
	}

}
