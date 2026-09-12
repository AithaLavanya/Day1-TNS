package com.tns.exceptionhandling;

public class NestedCatchExample {

	public static void main(String[] args) {
		try {
			try {
			int a=10/0;
			System.out.println(a);
		}
		catch(ArithmeticException e) {
			System.out.println("Inner Catch:Cannot divide by zero");
			
		}
		int[] arr= {1,2,3,4};
		System.out.println(arr[5]);

	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Outer Catch:Array Index is out of Bound");
	}
	System.out.println("Program executed Successfully");

}
}
