package test;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr word : ");
		String str = sc.nextLine();
		
		String [] word = str.split(" ");
	    for(int i=0; i<word.length - 1; i++)
	    {
	    	String second = word[word.length-1];
	        for(int j=0; j<second.length(); j++)
	        	System.out.print(second.charAt(j));
	        System.out.print(" ");
	        
	        String first = word[i];
	        for(int j=0; j<first.length(); j++)
        	    System.out.print(first.charAt(j));
	    	
	    		
	    }

	}

}
