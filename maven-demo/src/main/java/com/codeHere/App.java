package com.codeHere;
import java.util.*;

public class App {
	public void add(int a,int b) {
		System.out.println("Addition: " + (a+b));
	}
	public void sub(int a,int b) {
		System.out.println("Subtraction: " + (a-b));
	}
	public void mul(int a,int b) {
		System.out.println("Multiplication: " + (a*b));
	}
	public void div(int a,int b) {
		System.out.println("Division: " + (a/b));
	}
	
	public void Sample() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for addition: ");
		System.out.println("Press 2 for subtration: ");
		System.out.println("Press 3 for multiplication: ");
		System.out.println("Press 4 for division: ");
		
		int n = sc.nextInt();
		
		System.out.println("Enter the first number for calculation: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number for calculation: ");
		int b = sc.nextInt();
		
		switch(n) {
		case 1:
			add(a,b);
			break;
		
		case 2:
			sub(a,b);
			break;
			
		case 3:
			mul(a,b);
			break;
			
		case 4:
			div(a,b);
			break;
			
		default: 
			System.out.println("Enter valid choice..");
		}
	}
}
