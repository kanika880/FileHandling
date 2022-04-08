import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) {
		FileReader reader = null;
		try {
		reader = new FileReader("demo.txt");
		int data;
		while ((data = reader.read())!=-1) {
			System.out.print((char)data);
		}
	}catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
		if (reader != null) {
			reader.close();
		}
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
}
}