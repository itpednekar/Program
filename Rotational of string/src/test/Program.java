package test;

public class Program {

	public static void main(String[] args) 
	{
		String original = "AARADHYA";
		String key = "ARADHAAY";
		String newString = original.concat(original);
		if(newString.contains(key))
		{
			System.out.println("Key string is Rotational string");
		}
		else
		{
			System.out.println("Key string is not Rotational string");
		}

	}

}
