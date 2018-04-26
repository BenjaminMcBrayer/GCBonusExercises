import java.util.Scanner;

public class ExerciseEight {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int userNum;
		double userNum2;
		double firstUserNum;
		double secondUserNum;
		double sum;
		String playAgain = null;
		String userInfo = null;
		
		System.out.print("Please enter your name: ");
		userInfo = scnr.next();
		System.out.println("Hello, " + userInfo + "!");
		
		do {
			System.out.println("Please type any integer: ");
			userNum = scnr.nextInt();
			userNum = userNum + 1;
			System.out.println(userNum);
			
			System.out.println("Please enter a number: ");
			userNum2 = scnr.nextDouble();
			userNum2 = userNum2 + 0.5;
			System.out.println(userNum2);
			
			System.out.print("Enter a number: ");
			firstUserNum = scnr.nextDouble();
			System.out.println("Enter another number: ");
			secondUserNum = scnr.nextDouble();
			sum = firstUserNum + secondUserNum;
			System.out.println("The sum is " + sum);
			System.out.println("The product is " + (firstUserNum * secondUserNum));
			System.out.println();
			
			System.out.println(userInfo + ", would you like to continue (y/n)?");
			playAgain = scnr.next();
			scnr.nextLine();
		} while (playAgain.equalsIgnoreCase("y"));
		
		System.out.println("Goodbye, " + userInfo + "!");

		
		scnr.close();

	}

}
