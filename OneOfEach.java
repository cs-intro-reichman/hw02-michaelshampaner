/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean isBoy = false;
		boolean isGirl = false;
		int x = 0;
		int count = 0;
		while (isBoy == false || isGirl == false){
			x = (int)(Math.random() * 2 );
			count += 1;
			if (x == 0){
				isBoy = true;
				if (count == 1){
					System.out.print("b");
				}
				else{
					System.out.print(" b");
				}
			}
			else{
				isGirl = true;
				if (count == 1){
					System.out.print("g");
				}
				else{
					System.out.print(" g");
				}
			}
		}
		System.out.println();
		System.out.println("You made it... and you now have " + count + " children" );
	}
}
