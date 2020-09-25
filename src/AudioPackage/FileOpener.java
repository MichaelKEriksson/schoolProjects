package AudioPackage;

import java.awt.Desktop;
import java.io.File;

public class FileOpener {

	public void openFile(String fileLocation) {

		File filePath = new File(fileLocation);
		try {
			if (filePath.exists()) { // Checks file exists or not
				Desktop.getDesktop().open(filePath); // Desktop is used to access the file on the native computer.
														// open() is used to open the file.
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}