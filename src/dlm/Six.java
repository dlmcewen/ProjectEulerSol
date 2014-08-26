package dlm;

/**
 * 
 * @author David McEwen
 * 
 * Solutions to problem six of Project Euler
 *
 */
public class Six {

	public static void main(String[] args) {
		
		int sumOfSquares = 0;
		
		for(int i=1; i<=100; i++)	{
			sumOfSquares = (i*i)+sumOfSquares;
		}
		
		int squareOfSums = (100*(101))/2;
		
		squareOfSums = squareOfSums*squareOfSums;
		
		int diff = squareOfSums-sumOfSquares;
		
		System.out.println("Sum of squares: " + sumOfSquares);
		System.out.println("Square of sums: " + squareOfSums);
		System.out.println("Difference: " + diff);
		
	}

}
