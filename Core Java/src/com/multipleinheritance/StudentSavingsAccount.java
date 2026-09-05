package com.multipleinheritance;

public class StudentSavingsAccount extends SavingsAccount {
	double discount;
	void displayStudentSavingsDetails() {
		System.out.println("Student Discount: " + discount + "%");
	}

}
