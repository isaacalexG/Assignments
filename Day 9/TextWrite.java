package day9;

import java.io.FileWriter;
import java.io.IOException;

public class TextWrite {

	public static void main(String[] args) {
		FileWriter out = null;
		try {
			out = new FileWriter("C:\\files\\textOut.txt");
			int temp = 10;
			out.write(temp);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}	
}
