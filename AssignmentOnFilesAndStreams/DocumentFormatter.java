package filesAndStreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DocumentFormatter {
	
	public static void main(String[] args) throws IOException {
		File file=new File("TopProverbs.txt");
		try {
		//BufferedReader br=new BufferedReader(new FileReader(file));
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		String str= new String(bis.readAllBytes());
		System.out.println("Enter the new filename");
		Scanner sc=new Scanner(System.in);
		String filename=sc.nextLine();
		File file2=new File(filename);
		file2.createNewFile();
		StringBuffer out=new StringBuffer();
		for(String line:str.split("\n")){
			out.append(line.trim().replaceAll(" "+"\n", " "));
		}
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(file2));
		String strout=new String(out);
		bos.write(strout.getBytes());
		System.out.println(out);
		bos.close();
		br.close();
	}
	catch(NullPointerException ne) {
		ne.printStackTrace();
	}

}
}
