package AudioPackage;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AudioPlayer {

	public void playAudio(String audioLocation) {

		/*
		 * Method for playing audio files which will be passed to this method... ...by
		 * the string from actionPreformed method in ButtonListener class. The string is
		 * later on used to create an object to pass it in the functions/interface used
		 * to played the audio.
		 */

		File audioPath = new File(audioLocation); // Creates an object of the audio file string
		try {
			if (audioPath.exists()) { // Checks if there is a audio file to play
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(audioPath);
				// AudioInputStream passes the audio file in to the program and makes it
				// playable
				Clip clip = AudioSystem.getClip(); // Clip Interface gives control over the audio, to pause or stop itS
				clip.open(audioInput); // To open the audio before we can start/play it
				clip.start(); // Starts to play the audio file.
				clip.loop(Clip.LOOP_CONTINUOUSLY); // Loops the audio file over and over, until its terminated by user
				JOptionPane.showMessageDialog(null, "Is the sound annoying? \nPress *OK* to stop it.");
				// Opens a dialog for user to stop the audio from playing
				clip.stop(); // This function stops the audio.
			} else {
				System.out.println("Can't find file");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}