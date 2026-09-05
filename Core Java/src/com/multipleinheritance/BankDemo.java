package com.multipleinheritance;

public class BankDemo {

	public static void main(String[] args) {
		StudentSavingsAccount s = new StudentSavingsAccount();
		s.accountHolder="Lavanya";
		s.balance=10000;
		s.interestRate=5;
		s.discount=2;
		s.displayAccountDetails();
		s.displaySavingsDetails();
		s.displayStudentSavingsDetails();
	}

}
