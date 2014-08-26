package dlm;

public class Four {
	
	boolean palindrome(int num)	{
		
		String number = Integer.toString(num);
		
		int len = number.length();
		
		int i = 0;
		int j = len-1;
		int flag = 0;
		
		while (i<len)	{
			if(number.charAt(i) != number.charAt(j))	{
				flag = -1;
			}
			i++;
			j--;
		}
		
		if (flag == -1)	{
			return false;
		}
		else	{
			return true;
		}
	}
	
	public static void main(String Args[])	{
		Four test = new Four();
		
		System.out.println(test.palindrome(302403));
	}
}
