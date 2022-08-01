package day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BinaryRead {

	public static void main(String[] args) {
		FileInputStream sourceStream = null;
		try {
			try {
				sourceStream = new FileInputStream("C:\\files\\binaryI.txt");
				int temp = 0;
				while ((temp = sourceStream.read()) != -1) {
					System.out.println(temp);
				}
				
				
			} catch (FileNotFoundException e) { 
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} finally {
			try {
				if (sourceStream != null) 
					sourceStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
