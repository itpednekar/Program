package test;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		boolean flag = false;
		int len = str.length();
		char [] strArr = str.toCharArray();
		for(int i=0;i<len/2;i++)
		{
			if(strArr[i] != strArr[len - i - 1])
			{
				flag = true;
				break;
			}
		}
		if(flag == true)
			System.out.println("NOT Palindrom");
		else
			System.out.println("Palidrom");
	}

}
