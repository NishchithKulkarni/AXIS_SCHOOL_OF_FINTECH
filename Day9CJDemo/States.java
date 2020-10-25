import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashSet;

public class States {

	public static void main(String[] args) throws IOException {
		LinkedHashSet<> lh=new LinkedHashSet<>();
		File file=new File("states.txt");
		FileInputStream fs=new FileInputStream(file);
		String b=(String)fs.read();
		lh.add(b);
		fs.close();
	}

}
