package com.capgemini.Bank;

/**this comment is for Documentation based comment
 * 
 * @author sayakar
 * @since 3.10.2018
 *
 */
public abstract class BankAccount {
	//Encapsulation Concept is added
	int accountNo=0;
	String accountHolderName;
	double accountBalance;
 static int autoAccountNoGenerator;//class level scope shared among multiple objects
 //Two objects can  share 1 property using static variable.
	public BankAccount() {
		//super();
		accountNo=++autoAccountNoGenerator;
		accountHolderName="unknown";
		accountBalance=0;
		
	}
	
	public int getAccountNo() {
		return accountNo;
	}

	

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public static int getAutoAccountNoGenerator() {
		return autoAccountNoGenerator;
	}

	

	//constructor Overloading
	/*public BankAccount(int accountNo, String accountHolderName,
			double accountBalance) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}*/
	public BankAccount(String accountHolderName, double accountBalance) {
		super();
       accountNo=++autoAccountNoGenerator;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	public void withdraw(double amount)
	{
		accountBalance-=amount;
	}
	public void deposit(double amount)
	{
		accountBalance+=amount;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName="
				+ accountHolderName + ", accountBalance=" + accountBalance
				+ "]";
	}
	//Static Varaible
	/*public static void  main(String args[])
	
	{ 
		BankAccount acc1=new BankAccount();
		acc1.withdraw(5000);
		acc1.deposit(2000);
		BankAccount acc2=new BankAccount();
		acc2.deposit(5000);
		BankAccount acc3=acc1;
		BankAccount acc4=new BankAccount("aa",200.0);
		System.out.println("Bank Account 1"+acc1);
		System.out.println("Bank Account2"+acc2);
		System.out.println("Bank Account3"+acc3);
		System.out.println("Bank Account3"+acc4);
		
		/*Implementation of Setter and Getter Method*/
		
	
	
	

}
