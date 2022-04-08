
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CustomerReadDemo {
	public static void main(String[] args) {
		
		ObjectInputStream stream=null;
		try {
			stream = new ObjectInputStream (new FileInputStream("customerio"));
			Customer customer = (Customer) stream.readObject();
			System.out.println(customer);
			} catch(Exception e) {
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
	