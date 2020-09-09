package HangPack;

public class PrintHangman {

	public static void drawHangman(int guessesLeft) { 
		/*
		 * if "int guessesLeft" is decreased by playing the game(6 guessesLeft, 5, 4, etc.), prints the if/else if/else statement that matches
		 */
		  if(guessesLeft == 6) { // standard state, just the hangman "stand"
			  System.out.println(" _________\n"+
								 "|         |\n"+
								 "|        \n" +
								 "|       \n"+
								 "|        \n" +
								 "|       \n" +
								 "|\n" +
								 "|  \n");
		  }
		  else if(guessesLeft == 5) { //prints head
			 System.out.println(" _________\n"+
								"|         |\n"+
								"|         O\n" +
								"|       \n"+
								"|        \n" +
								"|       \n" +
								"|\n" +
								"|  \n");
		  }
		  else if(guessesLeft == 4) { // prints head + body
		   System.out.println(" _________\n"+
							  "|         |\n"+
							  "|         O\n" +
							  "|         |  \n"+
							  "|         |\n" +
							  "|       \n" +
							  "|\n" +
						      "|  \n");
		  }
		  else if(guessesLeft == 3) { // prints head + body + left arm
		   System.out.println(" _________\n"+
							  "|         |\n"+
							  "|         O\n" +
							  "|       __|  \n"+
							  "|         |\n" +
							  "|        \n" +
							  "|\n" +
							  "|  \n");
		  }
		  else if(guessesLeft == 2) { // prints head + body + left arm + right arm
		   System.out.println(" _________\n"+
							  "|         |\n"+
							  "|         O\n" +
							  "|       __|__ \n"+
							  "|         |\n" +
							  "|         \n" +
							  "|\n" +
							  "|  \n");
		  }
		  else if(guessesLeft == 1) { // prints head + body + left arm + right arm + left leg
		   System.out.println(" _________\n"+
							  "|         |\n"+
							  "|         O\n" +
							  "|       __|__ \n"+
							  "|         |\n" +
							  "|        /  \n" +
							  "|\n" +
							  "|  \n");
		  }
		  else{ // prints head + body + left arm + right arm + left leg + right leg = game over also!
		   System.out.println(" _________\n"+
							  "|         |\n"+
							  "|         O\n" +
							  "|       __|__ \n"+
							  "|         |\n" +
							  "|        / \\ \n" +
							  "|\n" +
							  "|  \n");
		  }
		 }
}
