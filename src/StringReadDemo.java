import java.io.FileInputStream;
import java.io.*;
import java.io.ObjectInputStream;

public class StringReadDemo {
	public static void main(String[] args) {
		ObjectInputStream stream = null;
		
		try {
			stream = new ObjectInputStream(new FileInputStream("stringio"));
			String s = (String) stream.readObject();
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (stream != null) {
					stream.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
