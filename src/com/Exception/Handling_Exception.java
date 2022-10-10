package com.Exception;

public class Handling_Exception {

	//Try ,Catch,finally=============
	public static void main(String[] args) {
	
		int a =10;
		try {
			System.out.println(a/0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("very good ");
		}
	}
	
	
	
	
}
	
	
//THROW THROWS===================
//public class compa {
//	private void RAM() throws Exception {
//
//	int i=10;
//	try {
//		System.out.println(i/0);
//	} catch (Exception e) {
//	throw new Exception();
//	
//	}
//
//}
//	public static void main(String[] args) throws Exception{
//		
//	}
//	}
//
//
//
//}
