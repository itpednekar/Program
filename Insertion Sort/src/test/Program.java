package test;

public class Program {

	public static void main(String[] args) 
	{
		int arr[] = {20,50,10,30,80,40};
		int j, temp;
		for(int i=1;i<arr.length; i++ )
		{
		    j = i;
		    temp = arr[i];
		    while(j>0 && arr[j-1]>temp)
		    {
		    	arr[j] = arr[j-1];
		    	j = j-1;
		    }
		    arr[j] = temp;
		}
    for (int i : arr) {
		System.out.print(i+" ");
	}
	}

}
