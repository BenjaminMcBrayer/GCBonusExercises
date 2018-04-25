import java.util.Scanner;

public class ExerciseSix {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String playAgain = null;

		do {
			System.out.println("Hello, World!");
			
			System.out.println("Would you like to continue (y/n)?");

			playAgain = scnr.next();

		} while (playAgain.equalsIgnoreCase("y"));

		scnr.close();

	}

}
