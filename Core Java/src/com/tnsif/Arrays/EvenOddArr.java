package com.tnsif.Arrays;

public class EvenOddArr {

	public static void main(String[] args) {
		int[] nums= {2,5,7,9,6,8};
		System.out.println("Even Numbers");
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				System.out.println(nums[i]);
			}
		}
		System.out.println("Odd Numbers");
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2!=0) {
				System.out.println(nums[i]);
			}
		}
		

	}

}
