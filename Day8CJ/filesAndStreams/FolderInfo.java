package filesAndStreams;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
public class FolderInfo {
	public static void printDirectory(String path2){
		File myFile=new File(path2);
		File[] files=myFile.listFiles();
		for(File file : files) {
			if(file.isFile()) {
				System.out.println("File : " +file.getName()+"\n File Path: "+file.getAbsoluteFile()+"\n Folder :"+file.getParent());				
			}
			else {
				System.out.println("Directory :"+file.getName()+"\n Folder Path: "+file.getAbsoluteFile()+"\nFolder :"+file.getParent());
			}
		}
}
	public static void main(String[] args) {
		//FolderInfo info=new FolderInfo();
		
		printDirectory("D:\\1 Nishchith\\");
	}

}
