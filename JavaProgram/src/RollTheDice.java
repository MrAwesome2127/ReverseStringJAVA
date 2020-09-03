import java.util.Random;

public class RollTheDice {

	public static void main(String[] args) {
		
		Random Roll = new Random();
		int x = Roll.nextInt(6) + 1;
		int y = Roll.nextInt(6) + 1;
		
		System.out.println("You rolled a: "+ x + " & " + y);
	}
}
