import java.util.Scanner;

public class ReverseString {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("This demo is to show you how to take an input string and have it appeared... Backwards (BIZARRO):");
		System.out.println("Enter your characters below to be BIZARRO:");
		Scanner inputValue = new Scanner(System.in);
		String inputValueString = inputValue.nextLine();
		String r = reverse(inputValueString);
		System.out.println("BIZARRO: "+ r);
	}
	
	public static String reverse(String s) {
		char[] letters = new char[s.length()];
		int letterindex = 0;
		
		for(int i = s.length() - 1 ; i >= 0; i--) {
			letters[letterindex] = s.charAt(i);
			letterindex++;
		}
		
		String reverse = "";
		
		for(int i = 0; i < s.length(); i++) {
			reverse = reverse + letters[i];
		}
		
		return reverse;
	}
}
