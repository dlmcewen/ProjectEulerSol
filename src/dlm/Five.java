package dlm;

/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

/**
 * @author David McEwen
 *
 * @returns Answer to #5
 */
public class Five {

	public static void main(String[] args) {
		/*
		int flag = -1;
		int j = 1;
		
		while (true)	{
			for (int i = 1; i < 20; i++)	{
				if (j%i != 0)	{
					flag = 0;
					break;
				}
			}
			if (flag == 0)	{
				flag = -1;
				j++;
			}
			else	{
				break;
			}
		}
		System.out.println("Value is: " + j);
		*/
		
		String test =  "abcdef";
		
		int len = test.length()-1;
		
		for (int i=len; i>=0; i--)	{
			System.out.print(test.charAt(i));
		}
	}
}
