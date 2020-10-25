package filesAndStreams;

import java.io.File;
import java.io.IOException;

public class TestFile {
	
	public static void main(String[] args) throws IOException {
	File folder=new File("Badminton");
	folder.mkdir();
	File file1=new File(folder,"singles.txt");
	file1.createNewFile();
	File file2=new File(folder,"dubbles.txt");
	file2.createNewFile();
	File subfolder=new File(folder,"courts");
	subfolder.mkdir();
	File file3=new File(subfolder,"smash.dat");
	file3.createNewFile();
	File file4=new File(folder,"doubles.txt");
	file2.renameTo(file4);
	file1.delete();
	}

}
