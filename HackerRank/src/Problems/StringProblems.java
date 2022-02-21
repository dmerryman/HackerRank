package Problems;

import java.io.PrintStream;

public class StringProblems {

	public StringProblems() {
		// TODO Auto-generated constructor stub
	}

	public static String getSmallestAndLargest(String s, int k)
	{
		String smallest = s.substring(0, k);
		String largest = s.substring(0, k);
		for (int i = 0; i <= s.length()- k; i++)
		{
			String subString = s.substring(i, i + k);
			//if (Debugger.isEnabled())
			//{
				//Debugger.log(subString);
			//}
			if (smallest.compareTo(subString) > 0)
			{
				smallest = subString;
			}
			if (largest.compareTo(subString) < 0)
			{
				largest = subString;
			}
		}
		return smallest + "\n" + largest;
	}

	public static void isPalindrome(String s)
	{
		boolean palindrome = true;
		var charArray = s.toCharArray();
		for (int i = 0; i < charArray.length / 2; i++)
		{
			if (charArray[i] != charArray[charArray.length - 1 - i])
			{
				palindrome = false;
				break;
			}
		}
		if (palindrome)
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.print("No");
		}
		
	}
}
