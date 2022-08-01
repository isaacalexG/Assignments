package day9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryWrite {

	public static void main(String[] args) {
		FileOutputStream targetStream = null;
		int temp = 0;

		try {
			try {
				targetStream = new FileOutputStream("C:\\files\\binaryOut.txt");
				temp = 5;
				targetStream.write((byte) temp);
				
				
			} catch (FileNotFoundException e) { 
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} finally {
			try {
				if (targetStream != null) {
					targetStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
