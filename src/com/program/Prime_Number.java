package com.program;

public class Prime_Number {//prime number or not 
	public static void main(String[] args) {
		int n= 10;
		//int a=7;
		 
		boolean flag = true;
		
		for (int i = 2; i < n; i++) {
	
			if(n% i==0) {
				flag=false;
			
			}
		}if(flag == true)
			System.out.println("prime number");
		
	
	else 
	{
		System.out.println("non prime number");
	}
	}}
