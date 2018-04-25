import java.util.Scanner;

public class ExerciseSeven {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String userInput;
		String playAgain = null;

		do {
			System.out.println("Enter some text: ");
			userInput = scnr.nextLine();
			System.out.println(userInput);
			System.out.println("Would you like to continue (y/n)?");
			playAgain = scnr.next();
			scnr.nextLine();
		} while (playAgain.equalsIgnoreCase("y"));

		if (!playAgain.equalsIgnoreCase("y")) {
			System.out.println("Goodbye!");
		}
		
		scnr.close();
		
		int odd = 0;
		int remainder = (odd % 2);
		odd = 51;
		System.out.println(remainder);
				
		
	}
}