package com.juniad.one;



public class BankingAccount {

	public void getBalance() {
		
		System.out.println("Account balance is 0");
		
	}
	public void getAccountType(char type) {

		switch (type) {
		case 'S':
              System.out.println("Savings Account");
              getBalance();
			break;
		case 'C':
			System.out.println("Savings Account");
            getBalance();
			break;
		default:
			System.out.println("Invalid input");
			break;
		}

	}
	public static void main(String[] args) {
		BankingAccount ba = new BankingAccount();
		ba.getAccountType('A');
		ba.getAccountType('S');
		ba.getAccountType('C');


	}

}
