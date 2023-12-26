/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String inputS = args[0];
		String newS = "";
		char middleChar;
		int lengthOfString = inputS.length();
		if (lengthOfString % 2 == 1){
			middleChar = inputS.charAt((lengthOfString - 1) / 2 );
		} else {
			middleChar = inputS.charAt(lengthOfString / 2 - 1);
		}
		for (int n = lengthOfString - 1; n >= 0; n--)
		{
			newS += inputS.charAt(n);
		}
		System.out.println(newS);
		System.out.println("The middle character is " + middleChar);
			
	}
}
