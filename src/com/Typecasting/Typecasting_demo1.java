package com.Typecasting;

public class Typecasting_demo1 {
	public static void main(String[] args) {
		System.out.println("narrowing");

		double a = 55.5;
		float b = (float) a;
		System.out.println("float datatype:" + b);

		long c = 88;
		int d = (int) c;
		System.out.println("int datatype:" + d);

		char e = 'f';
		byte x = (byte) e;
		System.out.println("byte datatype:" + x);
		System.out.println();

		System.out.println("wieding");
		int m = 55;
		long n = 12;
		System.out.println(n);
		System.out.println();

	}

}
