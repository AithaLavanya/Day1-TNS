package com.tnsif.Arrays;

public class LargestArrayelement {

	public static void main(String[] args) {
		int[] nums= {50,80,20,30,40};
		int largest =nums[0];
		for(int i=1;i<nums.length;i++) {
			if(nums[i]>largest) {
				largest=nums[i];
			}
		}
		System.out.println("Largest element=" +largest);
		

	}

}
