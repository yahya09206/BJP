public class BankAccount {
	private int 	accountNumber;
	private double 	balance;
	private String 	name;
	private String 	email;
	private String 	phoneNumber;

	public BankAccount(){
		// Empty constructor but calling the other constructor to fill in for default values
		this(12345, 2.50, "Default name", "Default email", "Default phoneNumber")
		System.out.println("Empty constructor called");
	}

	//Constructor with some default values
	public BankAccount(String name, String email, String phoneNumber){
		this(1234, 100.5, name, email, phoneNumber);
	}

	//BankAccount bobsAccount = new BankAccount(12345, 300.00, "Bob", "bob@email.com", "2340540304")
	public BankAccount(int accountNumber, double balance, String name, String email, String phoneNumber){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phoneNumber;
	}

	public int getAccountNumber(){
		return this.accountNumber;
	}

	public double getBalance(){
		return this.balance;
	}

	public String getName(){
		return this.name;
	}

	public String getEmail(){
		return this.email;
	}

	public String getPhoneNumber(){
		return this.phoneNumber;
	}

	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public void depositFunds(double addMoney){
		this.balance += addMoney;
		System.out.println("Deposit of " + addMoney + " made. New Balance " + this.balance);
	}

	public void withdrawFund(double withdrawalAmount){ 
		if (this.balance - withdrawalAmount < 0) {
			System.out.println("Not enough funds in your account!");
		}else{
			this.balance -= withdrawalAmount;
			System.out.println("WithDrawal Amount " + withdrawalAmount + " Remaining Balance: " + this.balance);
		} 
	} 
}