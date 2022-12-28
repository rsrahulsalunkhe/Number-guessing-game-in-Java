//Number guessing game in Java

import java.util.Scanner;

public class NumberGuessing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int myNumber = (int)(Math.random() * 100);

		int userNumber = 0;
		System.out.println("Guess number between 1 to 100.");

		do {
			System.out.print("Guess the number : ");
			userNumber = sc.nextInt();
			if(userNumber == myNumber) {
				System.out.println("Congratulations! You guessed correct number.");
				break;
			} else if(userNumber > myNumber) {
				System.out.println("Your number is large");
			} else {
				System.out.println("Your number is to small");
			}
		} while(userNumber >= 0);
	}
}
