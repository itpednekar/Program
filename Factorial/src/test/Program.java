package test;

public class Program {
	 static int fact = 1;
	public static void main(String[] args) 
	{
		/*
		int n =4 ;
		int fact = 1;
		for(int i=1; i<=n;i++)
			fact = fact * i;
		System.out.println(fact);*/
		int n = 7;
		factorial(n);
		System.out.println(fact);
	}
   
	private static int factorial(int i) 
	{
		if(i!=0)
		{
			fact = fact * i;
		    return  factorial(i-1);
		}
		return 1;
	}

}
