package test;

import java.util.Scanner;
import java.lang.Math;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no : ");
		int num = sc.nextInt();
		
		int temp = num;
		int sum = 0, rem, digits=0;
		
		while(temp!=0)
		{
			temp = temp/10;
			digits++;
		}
	    temp = num;
	    while (temp!=0)
	    {
	    	rem = temp%10;
	    	sum = (int) (sum + Math.pow(rem,digits));
	    	temp = temp/10; 	
	    }
	    if(num == sum)
	    	System.out.println("Amstrong No");
	    else
	    	System.out.println("Not Amstrong No");	
	}

}
