package uppgift1;

import java.util.Scanner;

public class passwordUppgift {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print("Enter your password: ");
		String password = reader.next();

		int tries = 3; // number of tries the user has to type the correct password
		while (tries > 0 && !password.equals("hejhej")) { // while the number of tries left is more then 0 and password
															// not correct typed, try again

			password = reader.nextLine();
			tries -= 1; // counts down number of tries used with 1 every time
			System.out.println("You have the total of tries left: " + tries); // prints number of tries left to use
																				// based on the counter

		}

		if (password.equals("hejhej")) { // if password typed correct, breaks the while loop and...
			System.out.println("Correct password!"); // ...prints this line
		}

		else { // this happens if user types types the password 3 times
			System.out.println("You are locked out. Please run the program to try again.");
		}
		reader.close();
	}
}