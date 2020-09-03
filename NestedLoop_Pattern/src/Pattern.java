import java.util.Scanner;

public class Pattern {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//output message and input value
		System.out.println("How many stars do you want?");
		Scanner scan = new Scanner(System.in);
		int numofStars = scan.nextInt();
		
		//top half of the pattern
		//row
		for(int i=1; i<=numofStars; i++) { 
			//columns
			for(int j=0; j<i; j++) {	
				System.out.print("*"); 
			}
			System.out.println();
		}
		
		//buttom half of the pattern. Reversed increments in row from + to -
		//row has -1 to be one row lower above to show decrease value.
		for(int i=numofStars -1; i>0; i--) {
			//columns
			for(int j=0; j<i; j++) {	
				System.out.print("*"); 
			}
			System.out.println();
		}
	}
}
