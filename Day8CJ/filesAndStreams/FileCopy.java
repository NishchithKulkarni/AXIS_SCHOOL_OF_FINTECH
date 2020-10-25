package filesAndStreams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileCopy {
	
	public static void main(String[] args) throws IOException {
		File file=new File("demo.txt");
		FileReader frs=new FileReader(file);
		FileWriter fws1=new FileWriter(file);
		FileWriter fws=new FileWriter("demo1.txt");
		fws.write("Java is interesting");
		fws1.write("Java is interesting");
		int i=frs.read();
		while(i!=-1) {
			fws.write(i);
			System.out.print((char)i);
		}
		frs.close();
		fws.close();
		fws1.close();
		
	}

}
