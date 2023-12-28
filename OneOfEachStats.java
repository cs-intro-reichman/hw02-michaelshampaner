import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		int overallCount = 0;
		int twoChildrenCount = 0;
		int threeChildrenCount = 0;
		int fourOrMore = 0;
		int tempCount = 0;
		for (int i = 0; i < T; i++)
		{
			boolean isBoy = false;
			boolean isGirl = false;
			tempCount = 0;
			while (!isBoy || !isGirl)
			{ // while there is no either boy and girl
				double boyOrGirl = generator.nextDouble();
				tempCount += 1;// current number of children
				if (boyOrGirl <= 0.5){
					isBoy = true;
				}
				else{
					isGirl = true;
				}
			}
			//adds 1 according to the size of family
			overallCount += tempCount;
			if (tempCount == 2){
				twoChildrenCount += 1;
			}
			else if (tempCount == 3){
				threeChildrenCount += 1;
			}
			else if (tempCount >= 4){
				fourOrMore += 1;
			}
		}
		String mostCommon = "";
		// check which group is the largest
		if ((twoChildrenCount >= threeChildrenCount) && (twoChildrenCount >= fourOrMore)){
			mostCommon = "2.";
		}
		else if (threeChildrenCount >= fourOrMore){
			mostCommon =  "3.";
		}
		else{
			mostCommon = "4 or more.";
		}
		System.out.println("Average: " + (double)overallCount / T + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChildrenCount);
		System.out.println("Number of families with 3 children: " + threeChildrenCount);
		System.out.println("Number of families with 4 or more children: " + fourOrMore);
		System.out.println("The most common number of children is " + mostCommon);
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		    
	}
}
