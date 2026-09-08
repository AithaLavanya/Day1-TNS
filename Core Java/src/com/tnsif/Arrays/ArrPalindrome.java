package com.tnsif.Arrays;

public class ArrPalindrome {

	public static void main(String[] args) {
		String word="level";
		String reverse="";
		for(int i=word.length()-1;i>=0;i--) {
			reverse=reverse+word.charAt(i);
		}
		System.out.println("Original Word: "+word);
		System.out.println("Reverse word: "+reverse);
		if(word.equals(reverse)) {
			System.out.println("the word is a palindrome.");
		}else {
			System.out.println("the word is not a palindrome.");
				
			}
	}
	
		
	}


