package com.constractor;

public class Worksheet {
	public  Worksheet(String a) {
		System.out.println("what is your name");
	}

		public  Worksheet(int a) {
			System.out.println(a);
		}
			
			public  Worksheet(char f) {
				System.out.println('f');
			}
			public static void main(String[] args) {
				Worksheet y = new Worksheet("WHAT I ");
				Worksheet k= new Worksheet(12);
				
				Worksheet G= new Worksheet('l');
			}


}
