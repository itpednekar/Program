package test;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence : ");
		String sentence = sc.nextLine();
	    String [] wordsArray = sentence.split(" ");
	    
	    for (int i = 0; i<wordsArray.length; i++) 
	    {
	    	char [] str = new char [50];
	    	str = wordsArray[wordsArray.length-1-i].toCharArray();
	    	for(int j = 0; j<str.length; j++)
	    	{
	    		System.out.print(str[j]);
	    	}
	    	System.out.print(" ");
		}
	}

}
