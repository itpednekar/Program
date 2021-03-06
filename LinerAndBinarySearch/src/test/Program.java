package test;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr =  {10,20,30,40,50,60};
		
		System.out.println("Enter element to be searched : ");
		int element = sc.nextInt();
		
		//Program.linerSearch(arr, element);
		Program.binarySearch(arr, element);

	}

	private static void linerSearch(int[] arr, int element) {
		int flag = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == element)
			{
				flag = 1;
				System.out.println("Element found at position "+i);
			}
		}
		if(flag == 0)
			System.out.println("Element not found");
		
	}

	private static void binarySearch(int[] arr, int element) 
	{
		/*int low = 0, high = arr.length-1;
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(arr[mid] == element)
			{
				System.out.println("Element found at postion "+mid);
				break;
			}
			else if(arr[mid]>element)
			{
				high = mid-1;
			}
			else
			{
				low = mid+1;
			}
		}*/
		int left = 0;
		int right = arr.length-1;

		
		while( left <= right )
		{
			int mid = (left+right)/2;
			if( arr[mid] == element )
			{
				System.out.println("Element found at postion "+mid);
				break;
			}
				
			if( element < arr[mid] )
				right = mid-1;
			else
				left = mid+1;
		}	
	}

}
