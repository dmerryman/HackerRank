package Problems;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

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

	public static boolean isAnagram(String a, String b)
	{
		Map<Character, Integer> aDictionary = new HashMap<Character, Integer>();
		Map<Character, Integer> bDictionary = new HashMap<Character, Integer>();
		boolean isAnagram = true;
		for (var c : a.toUpperCase().toCharArray())
		{
			if (!aDictionary.containsKey(c))
			{
				aDictionary.put(c, 1);
			}
			else
			{
				aDictionary.replace(c, aDictionary.get(c) + 1);
			}
		}
		
		for (var c : b.toUpperCase().toCharArray())
		{
			if (!bDictionary.containsKey(c))
			{
				bDictionary.put(c, 1);
			}
			else
			{
				bDictionary.replace(c, bDictionary.get(c) + 1);
			}
		}
		
		for (char key : aDictionary.keySet())
		{
			if (!bDictionary.containsKey(key))
			{
				isAnagram = false;
				break;
			}
			else if (bDictionary.get(key) != aDictionary.get(key))
			{
				isAnagram = false;
				break;
			}
		}
		if (isAnagram)
		{
			for (char key : bDictionary.keySet())
			{
				if (!aDictionary.containsKey(key))
				{
					isAnagram = false;
					break;
				}
				else if (aDictionary.get(key) != bDictionary.get(key))
				{
					isAnagram = false;
					break;
				}
			}
		}
		
		return isAnagram;
	}
}
