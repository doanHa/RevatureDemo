package demo;
import java.util.Scanner;
public class Assignment1_Part2 {

	public static void main(String[] args) {
		double userInput = 0;
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		
		try {
			userInput = Integer.parseInt(inputScanner.nextLine());
		} catch (NumberFormatException nfException) {
			System.out.println("User did not entered a number");
			System.exit(0);
		}
		
		if(userInput > 0.0) {
			System.out.println("User has entered a positive number");
		} else if(userInput < 0.0) {
			System.out.println("User has entered a negative number");
		} else
			System.out.println("User has entered 0");
		
	}

}
