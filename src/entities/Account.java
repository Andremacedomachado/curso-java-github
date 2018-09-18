package entities;

public class Account {

	private static final double TAX = 5.0;

	private int numberAccount;
	private String name;
	private double balance;

	// constructors
	public Account() {
		super();
	}

	public Account(int numberAccount, String name) {
		super();
		this.numberAccount = numberAccount;
		this.name = name;
	}

	public Account(int numberAccount, String name, double balance) {
		super();
		this.numberAccount = numberAccount;
		this.name = name;
		this.balance = balance;
	}
	
	public Account(int numberAccount, String name, double balance, char choice) {
		super();
		if(choice=='y'){
			this.numberAccount = numberAccount;
			this.name = name;
			this.balance = balance;
		}
		else{
			this.numberAccount = numberAccount;
			this.name = name;
		}
		
	}
	

	// encapsulation
	public int getNumberAccount() {
		return numberAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	// methods

	public void withdrawAccount(double price) {
		balance -= (price + TAX);
	}

	public void depositAccount(double price) {
		balance += price;
	}

	public String toString() {
		return "Account " + getNumberAccount() + ", Holder: " + getName() + ", Balance: $ "
				+ getBalance();
	}

}
