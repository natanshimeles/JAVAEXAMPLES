package fallthrough;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class write {
	public static void main(String[] args) {
		File a = new File("file.txt");
		try {
			PrintWriter p=new PrintWriter(a);
			p.write("hello");
			p.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
