/*
 *Mark Kwayisi
 */
import java.io.*;
public class DangerZoneFE {
	static final String IN_FILE_NAME = "dangerzone.txt";
	static final String OUT_FILE_NAME = "dangerzone2.txt";
	static final String DELIM = "\t";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a word to replace DANGER with.");
		DangerZone word = new DangerZone();
		word.dangerzone(IN_FILE_NAME);
		System.out.println("Finish writing to "+OUT_FILE_NAME);
	}

}
