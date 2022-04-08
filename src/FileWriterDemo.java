import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			writer = new FileWriter("demo.txt");
			String str = "Hello, welcome to Java";
			writer.write(str);
			System.out.println("string written in file");
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
			if (writer != null) {
				writer.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		}
	}

}
