package filesAndStreams;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ProverbReverser {
	 static void reverseWord(String str) {
		String [] str1=new String[10];
		StringBuffer out=new StringBuffer();
		int i=0;
		for(String word:str.split(" ")) {
			str1[i++]=word;
		}
		for(int j=9;j>=0;j--) {
			if(str1[j]!=null) {
				out.append(str1+" ");
			}
		}
		System.out.println(out);
		
	}
	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("TopProverbs.txt");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		String str=new String()
		for(String line : str.split("\n"))
		{	
			reverseWord(line);
		}
		bis.close();
	}

}
