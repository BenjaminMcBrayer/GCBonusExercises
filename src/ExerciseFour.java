import java.util.Scanner;

public class ExerciseFour {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double firstUserNum;
		double secondUserNum;
		double sum;
		
		System.out.print("Enter a number: ");
		firstUserNum = scnr.nextDouble();
		System.out.println("Enter another number: ");
		secondUserNum = scnr.nextDouble();
		sum = firstUserNum + secondUserNum;
		System.out.println("The sum is " + sum);

	}

}
