package test;

public class Program {

	public static void main(String[] args) 
	{
		/*int a = 0, b = 1;
		int c = 0;
		System.out.print(a+" "+b+" ");
		for(int i = 0; i<10; i++)
		{
			c = a + b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}*/
		System.out.print("0  1  ");
		fibonaciSeries(0, 1, 10);
	}

	private static void fibonaciSeries(int a,int b, int i) 
	{
		if(i == 0)
			return;
		
		System.out.print(a + b+"  ");
		    fibonaciSeries(b,a+b,i=i-1);
		
	}

}
