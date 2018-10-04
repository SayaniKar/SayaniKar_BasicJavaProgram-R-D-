package com.capgemini.Customer;

import com.capgemini.Bank.BankAccount;
import com.capgemini.Bank.CurrentAccountInsurance;
//import com.capgemini.Bank.Insurance;
import com.capgemini.Bank.SavingsAccount;
import com.capgemini.Bank.SavingsAccountInsurance;

public class Customer
{
	public static void main(String args[])
	{
		/*BankAccount account1=null;//when do we create reference then one empty structure of BankAccount is created
		//one memory in stack is allocated for the reference variable.
		account1=new SavingsAccount();
		account1.withdraw(5000);
		((SavingsAccount) account1).isSalaryAccount();
		
	}*/
	SavingsAccountInsurance s1=new SavingsAccountInsurance();
System.out.println(s1.getInsuranceName());
	System.out.println(s1.getInsuranceAmount());
	}
	//CurrentAccountInsurance c1=new CurrentAccountInsurance();
	//System.out.println(c1.getInsuranceName());
		//System.out.println(c1.getInsuranceAmount());
		}

