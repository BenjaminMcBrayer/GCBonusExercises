import java.util.Scanner;

public class ExerciseThree {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double userNum;
		
		System.out.println("Please enter a number: ");
		userNum = scnr.nextDouble();
		userNum = userNum + 0.5;
		System.out.println(userNum);
	}

}
