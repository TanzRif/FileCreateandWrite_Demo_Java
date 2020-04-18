package newfile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fileWrite {

	public static void main(String[] args) throws IOException {

		FileWriter note = new FileWriter("d:\\tnr.text");
		BufferedWriter tanz = new BufferedWriter(note);

		tanz.write("Life is short.");
		tanz.newLine();
		tanz.write("i am a goob boy. life will be fine");
		tanz.close();

	}

}
