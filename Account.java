package Banking_Simple;
public class Account {
	public String Name;
	public Double Balance;
	public String Number;
	public String email;
	public String phone_no;
	public String getName()
	{
		return Name;
	}
	public Double getBalance()
	{
		return Balance;
	}
	public String getNumber()
	{
		return Number;
	}
	public String getEmail()
	{
		return email;
	}
	public String getphone_no()
	{
		return phone_no;
	}
	public void setName(String name)
	{
		Name=name;
	}
	public void setBalance(Double balance)
	{
		Balance=balance;
	}
	public void setNumber(String number)
	{
		Number=number;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public void setPhone_no(String phone_no)
	{
		this.phone_no=phone_no;
	}
	//constructor
	public Account(String Name, Double Balance, String Number, String email, String phone_no)
	{
		this.Name=Name;
		this.Number=Number;
		this.Balance=Balance;
		this.email=email;
		this.phone_no=phone_no;
	}
	public void Deposit_Money(Double money)
	{
		Balance+=money;
		setBalance(Balance);
		System.out.println("Deposit is Successfull!!.. ");
		System.out.println("New Balance="+getBalance());
	}
	public void Withdraw(double money)
	{
		if(money<=Balance)
		{
			Balance-=money;
			setBalance(Balance);
			System.out.println("You have withdraw"+ money +" amount");
			System.out.println("New Balance="+getBalance());
		}
		else
		{
			System.out.println("Insufficient Balance!!..");
		}
	}
	public void Info()
	{
		System.out.println("Name: "+this.Name);
		System.out.println("Account no: "+this.Number);
		System.out.println("Email Id: "+this.email);
		System.out.println("Mobile No: "+this.phone_no);
		System.out.println("Balnce: "+this.Balance);
	}
	
}
