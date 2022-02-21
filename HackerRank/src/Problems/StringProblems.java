package Problems;

import Utilities.Debugger;

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
}
