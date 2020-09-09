package HangPack;

import java.util.Scanner;

public class MainGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // to get user input

		String menu = ""; // declares empty variable for menu feature
		int guessesLeft = 6; // amount of guesses the player have
		String playerGuess; // to store word guess from player
		String secretWord = SecretWord.getSecretWord(); // declares the String secretWord from class SecretWord with
														// private string

		boolean gameRunning = true; // to get the game running until player chooses to stop playing.. "quit feature"
									// in switch case 4

		while (gameRunning) {

			System.out.println("----------------------------------------------------");
			System.out.println("Welcome to the main menu of Hangman. ");
			System.out.println("\nWhat would you like to do? \n" + "\nType 'status' to see guesses left."
					+ "\nType 'letter' to guess a letter." + "\nType 'word' to guess the word. "
					+ "\nType 'quit' to stop playing.");
			System.out.println(); // for formatting
			System.out.println("----------------------------------------------------");

			menu = scanner.nextLine(); // to get input from player at the menu

			switch (menu) {
			case "status":
				PrintHangman.drawHangman(guessesLeft); // prints the drawHangman method from the PrintHangman class,
														// based on how many guesses the player have left
				System.out.println("Number of guesses left: " + guessesLeft);
				System.out.println(); // for formatting
				break; // to get out from this case and back to "main menu"

			case "letter":
				System.out.println("You chosen to make a guess of a letter.");

				char[] wordToGuess = secretWord.toCharArray(); // takes the locally stored String secretWord and breaks
																// it down to characters / char array

				char[] recordAnswers = new char[wordToGuess.length]; // char array to record the answers from the player

				for (int i = 0; i < wordToGuess.length; i++) { // initiates the recordAnswer with a "-"
					recordAnswers[i] = '-'; // this is check later used to see if there is a match between userGuess and
											// wordToGuess
				}

				boolean correctGuess = false;

				while (correctGuess == false) { // loop to keep the "letter guessing" going until player found the word

					System.out.println();
					System.out.print("Please guess a character: ");

					char userGuess = scanner.nextLine().charAt(0); // reads the first character from player input and
																	// initiates userGuess

					boolean charFound = false;

					for (int i = 0; i < wordToGuess.length; i++) { // loops through each character
						if (userGuess == wordToGuess[i]) { // to compare if player input is in the
															// wordToGuess/secretWord if it is;
							recordAnswers[i] = wordToGuess[i]; // then records the user input to wordToGuess array
							charFound = true;

						}
					}
					if (!charFound) { // a character is not found...
						System.out.println("You guessed wrong."); // ... print this message and...
						guessesLeft--; // ... reduce the guesses player have left

					}

					boolean wordDone = true;
					for (int i = 0; i < recordAnswers.length; i++) {

						if (recordAnswers[i] == '-') { // if not recorded a correct guess..
							System.out.print("*"); // print out a "*" for every character of the secretWord

							wordDone = false;
						} else {
							System.out.print(recordAnswers[i]); // prints out the correct guessed letter
						}
					}
					System.out.println();
					System.out.println("Guesses left: " + guessesLeft);

					PrintHangman.drawHangman(guessesLeft); // initiates the drawHangman method from PrintHangman class
															// with the guessesLeft variable
															

					if (wordDone) { // if wordDone is true, the word is found, we set correctGuess to true, and the game is over
						System.out.println("Your found the secret word!");
						System.out.println("Congratulations, game over!");
						correctGuess = true;
					}

					if (guessesLeft <= 0) { // if player used all of the guesses "correctGuess" is set to true, to end
											// the game
						System.out.println("Game over, you lost.");
						correctGuess = true;
					}

				}
				break;

			case "word":
				System.out.println("You chosen to guess the correct word.");
				System.out.print("Please make a guess of the word: ");
				playerGuess = scanner.nextLine(); // stores input from player in playerGuess
				if (playerGuess.equals(secretWord)) { // compares playerGuess with secretWord to see if they match
					System.out.println("Your guessed correctly on the secret word!");
					System.out.println("Congratulations, game over!");
				} else { // if not a match, remove a guess from the guessesLeft
					System.out.println("You guessed wrong!");
					guessesLeft--;
				}

				break;

			case "quit":
				System.out.println("You chosen to quit playing the game.");

				gameRunning = false; // to terminate the program
				break;

			}

		}

		scanner.close();
	}

}
