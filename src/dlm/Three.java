package dlm;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Problem 3 - Project Euler
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime factor of the number 600851475143?
 */

/**
 * @author David McEwen
 *
 * @returns Answer to #3
 */
public class Three {
	
	public static void main(String[] args)	{
		//long len = 13195L;
		long len = 600851475143L;
		//long len = 60083775143L;
		//double len = 432341;
		
		ArrayList<Long> list = new ArrayList<Long>();
		
		if (len%2==0)	{
			list.add(2L);
		}
		
		for (long i=3L; i<len; i+=2)	{
			if(i>3 && i%3==0) {
				//skip
			}
			else if (i>5 && i%5==0)	{
				//skip
			}
			else if (i>7 && i%7==0) {
				//skip
			}
			else if (i>13 && i%13==0)	{
				//skip
			}
			else if (len % i == 0)	{
				list.add(i);
			}
		}
		
		for(long var : list)	{
			System.out.println(var);
		}
	}
}
