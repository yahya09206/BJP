public class VipCustomer{

	private String name;
	private double creditLimit;
	private String emailAddress;

	// Empty constructor to call the constructor with 3 fields with default values
	public VipCustomer(){
		this("Default Name", 133.00, "Default Email Address");
		System.out.println("Empty Constructor Called");
	}
	// Constructor to pass on the 2 values it recieves and add a default value
	public VipCustomer(String name, double creditLimit){
			this(name, creditLimit, "unknowne@email.com");
	}

	//VipCustomer person1 = new VipCustomer();
	//System.out.println(person1.getName());
	public VipCustomer(String name, double creditLimit, String emailAddress){
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}

	public String getName(){
		return this.name;
	}

	public double getCreditLimit(){
		return this.creditLimit;
	}

	public String getEmailAddress(){
		return this.emailAddress;
	}

}