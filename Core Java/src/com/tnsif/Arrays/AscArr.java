package com.tnsif.Arrays;

public class AscArr {

	public static void main(String[] args) {
		int[] nums= {28,2,15,20,11};
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]>nums[j]) {
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println("Array in ascending order:");
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]+" ");
		}
	}

}
