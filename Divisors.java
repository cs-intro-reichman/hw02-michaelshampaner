/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int input = Integer.parseInt(args[0]);
		// checks if i is a divisor of input until reaches to value of input * 0.5
		// no need to check further than 0.5 * input because its the largest integer possible to divide
		for (int i = 1; i <= 0.5 * input; i++)
		{
			if (input % i == 0) 
			{
				System.out.println(i);
			}
		}
		System.out.println(input);
		
	}
}
