package day9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferReadWrite {

	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			Reader reader = new FileReader("C:\\files\\bufferIn.txt");
			br = new BufferedReader(reader);
			String s = null;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}

			File outFile = new File("C:\\files\\bufferOut.txt");
			Writer writer = new FileWriter(outFile);
			bw = new BufferedWriter(writer);
			s = "buffer write test";
			bw.write(s);
			bw.flush();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
