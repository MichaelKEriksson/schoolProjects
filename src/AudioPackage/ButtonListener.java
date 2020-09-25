package AudioPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ButtonListener implements ActionListener {

	String audio1 = "poker-chips.wav";
	String audio2 = "police-whistle.wav";
	String audio3 = "service-bell.wav";
	String userManual = "user-manual.pdf";

	AudioPlayer audioPlayer = new AudioPlayer(); // Creates an object of the AudioPlayer
	FileOpener fileOpener = new FileOpener(); // Creates an object of the FileOpener

	public ButtonListener(JButton b) {

		/*
		 * This is empty, but still needed to get the "listener" to work. Why, I haven't
		 * figured out.
		 */

	}

	@Override
	public void actionPerformed(ActionEvent e) { // listens for events on buttons
		/*
		 * Each case value matches the names of the JButtons in UserInterface Class.
		 * When a JButton is pressed the JButton name is compared to the values of each
		 * switch case. IF they match, execute the code in the block.
		 */

		switch (e.getActionCommand()) {
		case "Audio 1":
			audioPlayer.playAudio(audio1); // Calls the playAudio method from audioPlayer object and initiates it with
											// given string
			break;
		case "Audio 2":
			audioPlayer.playAudio(audio2);
			break;
		case "Audio 3":
			audioPlayer.playAudio(audio3);
			break;
		case "User Manual":
			fileOpener.openFile(userManual); // Calls the openFile method from fileOpener object.
			break;
		}
	}
}