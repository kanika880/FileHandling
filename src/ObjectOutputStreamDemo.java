import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class ObjectOutputStreamDemo {
	public static void main(String[] args) {
		String str = "hello world";
		
		ObjectOutputStream stream=null;
		try {
			stream = new ObjectOutputStream (new FileOutputStream("stringio1"));
			stream.writeObject(str);
			System.out.println("printed");
			} catch(IOException e) {
				System.out.println("exception");
				
				
			}finally {
				if (stream != null) {
					try {
					stream.close();	
				} catch(IOException e) {
					e.printStackTrace();
				}
				}
				
			}
			

		}}
	
	
	
	
