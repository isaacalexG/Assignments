package day9;

import java.io.FileReader;
import java.io.IOException;

public class TextRead {

	public static void main(String[] args) {
		FileReader in = null;
		try {
			in = new FileReader("C:\\files\\textIn.txt");
			int temp = 0;
			while (( temp = in.read()) != -1) {
				System.out.println(temp);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}	
}
