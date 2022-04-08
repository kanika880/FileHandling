import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StringWriteDemo {
	public static void main(String[] args) {
		String str = "Hello, world";
		 ObjectOutputStream stream = null;
		 try {
		 stream = new ObjectOutputStream(new FileOutputStream("stringio"));
		 stream.writeObject(str);
		 System.out.println("data written");
		 }catch(IOException e) {
			 e.printStackTrace();
		 }finally {
			 if (stream != null) {
				 try {
					stream.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			 }
		 }
	}
}
