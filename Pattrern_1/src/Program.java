import java.util.Scanner;

public class Program 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter no : ");
		int n= sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2*n-1; j++) {
				if(j>=i && j<=n-i+1)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
	}
}
