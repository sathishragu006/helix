package com.program;

public class Number_Pattern {
	public static void main(String[] args) {
		int n=4,p=10;
		for (int i = 0; i <=n; i++) {
			for(int j=1;j>=i;j++) {
				System.out.print(p++ +" ");
			}
			System.out.println();
		}
	}

}
