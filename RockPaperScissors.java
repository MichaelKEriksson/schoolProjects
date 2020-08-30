import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int playerOneScore = 0;
		int playerTwoScore = 0;
		int counter = 0;
		String playerOneNameChoice; //used to store value from input from method "getPlayerOneName" to print later on
		String playerTwoNameChoice; //used to store value from input from method "getPlayerTwoName" to print later on
		int playerOneChoice; //used to store value from input from method "getPlayerOneChoice" to print later on
		int playerTwoChoice; //used to store value from input from method "getPlayerTwoChoice" to print later on

		playerOneNameChoice = getPlayerOneName(reader); //calls for method for player one name
		playerTwoNameChoice = getPlayerTwoName(reader); //calls for method for player two name

		while (counter == 0) { //while the counter remains at 0, keep the while loop going

			playerOneChoice = getPlayerOneChoice(reader); //calls for method for player one game choice
			playerTwoChoice = getPlayerTwoChoice(reader); //calls for method for player two game choice

			if (playerOneChoice == playerTwoChoice) { //if player1 and player 2 selects the same, keep while loop running 
				System.out.println("It's a tie!");
			}

			else if (playerOneChoice == 1) {
				if (playerTwoChoice == 2) {
					System.out.println("Player one, " + playerOneNameChoice + ", chose rock!");
					System.out.println("Player two, " + playerTwoNameChoice + ", chose paper!");

					playerTwoScore++; //adds +1 for for playerTwoScore (this is used to show the winner) //works the same for player one

				}

				else if (playerTwoChoice == 3) {
					System.out.println("Player one, " + playerOneNameChoice + ", chose rock!");
					System.out.println("Player two, " + playerTwoNameChoice + ", chose scissors!");

					playerOneScore++; //adds +1 for for playerOneScore (this is used to show the winner)

				}
			}

			else if (playerOneChoice == 2) {
				if (playerTwoChoice == 1) {
					System.out.println("Player one, " + playerOneNameChoice + ", chose paper!");
					System.out.println("Player two, " + playerTwoNameChoice + ", chose rock!");

					playerOneScore++;

				} else if (playerTwoChoice == 3) {
					System.out.println("Player one, " + playerOneNameChoice + ", chose paper!");
					System.out.println("Player two, " + playerTwoNameChoice + ", chose scissors!");

					playerTwoScore++;

				}
			}

			else if (playerOneChoice == 3) {
				if (playerTwoChoice == 1) {
					System.out.println("Player one, " + playerOneNameChoice + ", chose scissors!");
					System.out.println("Player two, " + playerTwoNameChoice + ", chose rock!");

					playerTwoScore++;
				}

				else if (playerTwoChoice == 2) {
					System.out.println("Player one, " + playerOneNameChoice + ", chose scissors!");
					System.out.println("Player two, " + playerTwoNameChoice + ", chose paper!");

					playerOneScore++;
				}
			}

			if (playerOneScore == 1) {  //...if the player gets +1, winner can be chosen (by increasing the number, number of rounds can be larger)
				System.out.println("Player one, " + playerOneNameChoice + ", wins!");
				counter++; // this add +1 to counter to end the while loop // works the same for player two
			}
			if (playerTwoScore == 1) {
				System.out.println("Player two, " + playerTwoNameChoice + ", wins!");
				counter++;
			}

		}
reader.close();
	}

	public static String getPlayerOneName(Scanner reader) { 
		String playerOneNameChoice;

		System.out.println("Hello, player One. Whats your name? ");
		playerOneNameChoice = reader.nextLine(); //reads input from user to ...

		return playerOneNameChoice; //...return value to string
	}

	public static String getPlayerTwoName(Scanner reader) {
		String playerTwoNameChoice;

		System.out.println("Hello, player Two. Whats your name? ");
		playerTwoNameChoice = reader.nextLine();

		return playerTwoNameChoice;
	}

	public static int getPlayerOneChoice(Scanner reader) {
		int playerOneChoice;

		System.out.println("Ready up Player one! \nPlease choose; 1 for rock, 2 for paper, 3 for scissors");

		playerOneChoice = reader.nextInt();
		return playerOneChoice;
	}

	public static int getPlayerTwoChoice(Scanner reader) {
		int playerTwoChoice;
		System.out.println("Ready up Player two! \nPlease choose; 1 for rock, 2 for paper, 3 for scissors");

		playerTwoChoice = reader.nextInt();
		return playerTwoChoice;
	}
}
