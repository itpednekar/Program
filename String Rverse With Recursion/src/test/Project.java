package test;

public class Project {

	public static void main(String[] args)
	{
		String str= "ABCD";
	    reverseString(str);
	}

	private static void reverseString(String str) 
	{
		if (str.length() == 0)
			return;
		reverseString(str.substring(1));
		    System.out.print(str.charAt(0));
	}

}
