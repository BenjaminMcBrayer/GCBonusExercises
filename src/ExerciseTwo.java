import java.util.Scanner;

public class ExerciseTwo {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userNum;
		
		System.out.println("Please type any integer: ");
		userNum = scnr.nextInt();
		userNum = userNum + 1;
		System.out.println(userNum);
	}

}
