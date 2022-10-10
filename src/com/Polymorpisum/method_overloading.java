package com.Polymorpisum;

public class method_overloading {

	public void method_overloading(int a) {
		System.out.println(a);
	}

	public void method_overloading(String b, int m) {
		System.out.println(m + b);// (data order)concodnation in sout out put only it print
	}

	public void method_overloading() {
		System.out.println("family");
	}

	public void method_overloading(String n) {
		System.out.println(n);
	}

	public static void main(String[] args) {
		method_overloading m = new method_overloading();
		m.method_overloading();
		m.method_overloading(101);
		m.method_overloading("ghhg", 121);
		m.method_overloading("narrow");

	}
}
