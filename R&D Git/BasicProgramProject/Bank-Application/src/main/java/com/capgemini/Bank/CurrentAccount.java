package com.capgemini.Bank;

public class CurrentAccount extends BankAccount implements Insurance{
	public void withdraw(double amount)

	{
	System.out.println("Current Account is called");
	}

	@Override
	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return "JeevanBima";
	}

	@Override
	public double getInsuranceAmount() {
		// TODO Auto-generated method stub
		return 200000;
	}
}
