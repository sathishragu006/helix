package com.Abstract;

public class parent implements man,woman{
	@Override
	public void red() {
		System.out.println("7");
		
	}
	@Override
	public void yellow() {
		System.out.println("3");
		
	}
	@Override
	public void black() {
		System.out.println("4");
		
	}
	@Override
	public void green() {
		System.out.println("5");
		
	}
	public static void main(String[] args) {
		parent obj = new parent();
		obj.black();
		obj.green();
		obj.red();
		obj.yellow();
		
	}

}
