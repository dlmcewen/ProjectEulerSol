package dlm;

public class Reverse {
	
	
	public static void main(String Args[])	{
		String toRev = "abcdef";
		
		int length = toRev.length() - 1;
		
		for (int i=length; i >= 0; i--)	{
			System.out.println(toRev.charAt(i));
		}
	}
	
}
