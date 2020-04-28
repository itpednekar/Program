package test;

public class Program {

	public static void main(String[] args) 
	{
		int [] arr = {20,30,50,10,15,60,5};
		int smallest = arr[0];
		//int min = 0;
		for(int i=0;i<arr.length;i++)
		{
			//min = i;
			if(arr[i]<smallest)
				smallest = arr[i];
		}
		System.out.println("Smallest element is : "+smallest);
	}

}
