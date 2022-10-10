package com.Selection_Statement;

import java.util.Scanner;

public class Ifelseladder_demo1 {
public static void main(String[] args, int mark) {
	Scanner ref = new Scanner(System.in);
	System.out.println("enter your marks");
	int a=ref.nextInt();
	if (mark<50)
	{System.out.println("fail");
	}
	else if(mark<=50 && mark<70)
	{
		System.out.println("gread a");
	}	
	else if(mark<=60 && mark<80)
	{
		System.out.println("gread a");
	}else if(mark<=60 && mark<90)
	{
		System.out.println("gread a");
	}	
	else
	{
		System.out.println("invalid");
	}}
}
