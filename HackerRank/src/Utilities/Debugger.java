package Utilities;

public class Debugger {

	public Debugger() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean isEnabled()
	{
		return true;
	}
	
	public static void log(Object o)
	{
		System.out.println(o.toString());
	}

}
