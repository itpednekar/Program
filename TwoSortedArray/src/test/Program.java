package test;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) 
	{
		int [] arr1 = {10,1,9,5};
		int [] arr2 = {4,3};
		
		int [] arr3 = new int[arr1.length+arr2.length];
		
		int i=0, j=0, k=0;
	
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
		while(i<arr1.length && j<arr2.length)
		{
				if(arr1[i]<arr2[j])
				{
					arr3[k] = arr1[i];
					i++; k++;
				}
				else
				{
					arr3[k] = arr2[j];
					j++; k++;
				}
		}
		while(i<arr1.length)
			arr3[k++] = arr1[i++];
		while(j<arr2.length)
			arr3[k++] = arr2[j++];
		
		for (int m : arr3) {
			System.out.print(m+" ");
		}
	}

}
