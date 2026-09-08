package com.tnsif.Arrays;

public class ArrElementCount {

	public static void main(String[] args) {
		int[] nums= {20,10,15,28,30,50,10,23,10};
		int element=10;
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==element) {
				count++;
				
			}
		}
		System.out.println("Element: "+element);
		System.out.println("Number of occurence: "+count);
	}

}
