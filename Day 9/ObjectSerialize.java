package day9;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectSerialize {

	public static void main(String[] args) {
		Object o = new Object("object", 6);
		FileOutputStream out = null;
		ObjectOutputStream objectOut = null;

		try {
			out = new FileOutputStream("C:\\files\\objectOut.txt");
			objectOut = new ObjectOutputStream(out);
			objectOut.writeObject(o);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				out.close();
				objectOut.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}

class Object implements Serializable {
	private static final long serialVersionUID = 8787L;
	private String name;
	private int num;
	
	Object (String s, int n){
		name = s;
		num = n;
	}
}
