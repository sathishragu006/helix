package com.program;

public class Reverse_String {
	public static void main(String[] args) {
		String original ="ram";
		String reverse = "";
		int length = original.length();
		for(int i= length-1; i>=0;i--) 
			reverse= reverse+original.charAt(i);
		System.out.println(reverse);
	}
}	


