package com.capgemini.Bank;

public class CurrentAccountInsurance extends CurrentAccount implements Insurance {
	public static void mian(String args[])
	{
	}
	
		@Override
		public String getInsuranceName() {
			// TODO Auto-generated method stub
			return "Jeevan Beema";
		}
		

		@Override
		public double getInsuranceAmount() {
			// TODO Auto-generated method stub
			return 20000;
		}
	}


