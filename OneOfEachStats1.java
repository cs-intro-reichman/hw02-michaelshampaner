/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int overallCount = 0;
		int twoChildrenCount = 0;
		int threeChildrenCount = 0;
		int fourOrMore = 0;
		int tempCount = 0;
		double boyOrGirl = 0;
		for (int i = 0; i < T; i++)
		{
			boolean isBoy = false;
			boolean isGirl = false;
			tempCount = 0;
			while (!isBoy || !isGirl){ // while there is no either boy and girl
				boyOrGirl = (double)(Math.random());// two possible options: <0.5 for boy, >=0.5 for girl
				tempCount += 1;// current number of children
				if (boyOrGirl <0.5){
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
	}
}
