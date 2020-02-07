package test;

import java.util.HashMap;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word : ");
		String word = sc.nextLine();
        HashMap<Character, Integer> hs = new HashMap<>();
        char [ ] arr = word.toCharArray();
        int cnt = 0;
        for(int i=0;i<arr.length; i++)
        {
        	if(!hs.containsKey(arr[i]))
        	{
        		hs.put(arr[i], 1);
        		cnt = 1;
        	}	
        	else 
        	{
        		hs.put(arr[i], ++cnt);
        	}
        }
        System.out.println(hs);
        
        for(int i=0; i<arr.length; i++)
        {
        	char ch = arr[i];
        	if(hs.get(ch) == 1)
        	{
        		System.out.println(ch);
        		break;
        	}
        }
	}

}
