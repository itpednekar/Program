package test;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no : ");
		int num = sc.nextInt();
		int fact = 1;
		int n = num;
		
		for(int i=n;i>0;i--) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
