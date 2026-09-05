package com.multipleinheritance;

public class SavingsAccount extends Account {
	double interestRate;
	void displaySavingsDetails() {
		System.out.println("Interest Rate: " + interestRate + "%");
	}

}
