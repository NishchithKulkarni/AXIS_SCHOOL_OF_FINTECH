package filesAndStreams;
import java.util.Scanner;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class ProverbCollection {
	public void storeProverb(String proverb) throws IOException {
		byte [] data=proverb.getBytes();
		String str="STOP";
		byte [] data1=str.getBytes();
		FileOutputStream file=new FileOutputStream("TopProverbs.txt");
	
		BufferedOutputStream bos=new BufferedOutputStream(file);
		
		bos.write(data);
		if(data==data1){
			bos.close();
		}
	}
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Write a proverb");
		String str1;
		str1=sc.nextLine();
		ProverbCollection pc=new ProverbCollection();
		pc.storeProverb(str1);
		sc.close();
	}

}
