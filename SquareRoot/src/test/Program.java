package test;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no : ");
		int no = sc.nextInt();
		double i;
		for(i=0.001;i*i<no;i = i + 0.001);
		System.out.printf("Square root = %.2f",i);
	}

}
