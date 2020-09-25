package AudioPackage;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class UserInterface {

	public static void runProgram() {

		JFrame frame = new JFrame("The Annoying Audio Application"); // Subject/title row in the
																						// created interface/frame.
		frame.setPreferredSize(new Dimension(500, 500)); // Sets the size of the created interface/frame.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // To exit the application on X symbol.
		runLayout(frame.getContentPane()); // This makes it possible to add the containers on the frame.
		frame.pack(); // Calls the method pack which sizes the frame so that all its contents are at
						// or above their preferred sizes.
		frame.setVisible(true); // Calls the method setVisable which makes the frame appear on the screen.
	}

	public static void runLayout(Container container) {

		GridLayout layout = new GridLayout(1, 4); // Creates a GridLayout with the layout of 1 row and 4 columns.
		container.setLayout(layout); // Container is used to hold the JButtons in the GridLayout

		JButton buttonOne = new JButton("Audio 1"); // Creates a new JButton called Audio 1
		ButtonListener b1 = new ButtonListener(buttonOne); // adds a listener to the JButton
		buttonOne.addActionListener(b1); // Adds a actionListener to the JButton

		JButton buttonTwo = new JButton("Audio 2");
		ButtonListener b2 = new ButtonListener(buttonTwo);
		buttonTwo.addActionListener(b2);

		JButton buttonThree = new JButton("Audio 3");
		ButtonListener b3 = new ButtonListener(buttonThree);
		buttonThree.addActionListener(b3);

		JButton buttonFour = new JButton("User Manual");
		ButtonListener b4 = new ButtonListener(buttonFour);
		buttonFour.addActionListener(b4);

		container.add(buttonOne); // Adds the JButton to the container, starting from top left corner
		container.add(buttonTwo); // Adds the next JButton to the right hand side in the next available container
		container.add(buttonThree); // ...and so on...
		container.add(buttonFour);
	}
}