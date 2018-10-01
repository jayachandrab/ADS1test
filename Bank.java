package com.bank;
// bank example
class Account{
	double balance;

	public Account(double balance) {
		if(balance<0.0) {
			System.out.println("initial balance invalid");
		}
		else {
			this.balance = balance;
		}
		
	}
	
	public void creditAccount(double balance) {
		
	}
	
     public void debitAccount(double balance) {
		
	}
     
     public double getBalance() {
    	 return this.balance;
     }
	
	
	
}

class SavingsAccount extends Account{
   
	float interest;
	
	public SavingsAccount(double balance,int interest) {
		
		// TODO Auto-generated constructor stub
		super(balance);
		this.interest=interest;
	}
	
	public double calculateSavingsInterest() {
		return 0.0;
	}
	
}

class CheckingAccount{
	
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
