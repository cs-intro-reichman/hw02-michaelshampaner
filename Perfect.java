/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int inputNum = Integer.parseInt(args[0]);
		String s = inputNum + " is a perfect number since " + inputNum + " = 1";
		int sum = 1;
		// checks for all inputNum divisors and sums them
		for (int i = 2; i <= 0.5 * inputNum; i++)
		{
			if (inputNum % i == 0) 
			{
				sum += i;
				s += " + " + i;
			}
		}
		if (sum == inputNum)
		{
			System.out.println(s);
		}
		else{
			System.out.println(inputNum + " is not a perfect number");
		}
		
	}
}
