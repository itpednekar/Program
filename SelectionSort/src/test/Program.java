package test;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int [] arr =  {90,10,20,80,30,40,50,60};
		int temp=0, min=0;
		int i=0,j=0;
		
		for(i=0;i<arr.length;i++)
		{
			min = i;
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
					min=j;
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		for (int k : arr) {
			System.out.println(k);
		}		
		/*int min = 0;
		int temp = 0;
		for(int i=0; i<arr.length;i++)
		{
			min = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
					min = j;
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		for (int i : arr) {
			System.out.print(i+"  ");
		}
		*/

	}

}
