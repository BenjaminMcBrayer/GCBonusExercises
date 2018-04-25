import java.util.Scanner;

public class ExerciseFive {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		double firstUserNum;
		double secondUserNum;

		System.out.println("Enter a number: ");
		firstUserNum = scnr.nextDouble();

		System.out.println("Enter another number: ");
		secondUserNum = scnr.nextDouble();

		System.out.println("The product is " + (firstUserNum * secondUserNum));

		scnr.close();
	}

}
