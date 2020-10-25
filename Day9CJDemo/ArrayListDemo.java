import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++) {
		marks.add(sc.nextInt());
		}
		System.out.println(marks);
		System.out.println("Highest marks:"+Collections.max(marks));
		int sum=0,avg=0;
		for(int i=0;i<marks.size();i++) {
			sum=sum+marks.get(i);
			avg=sum/(i+1);
		}
		System.out.println("Average:"+avg);
		for(int i=0;i<marks.size();i++) {
			System.out.println(i+"-"+marks.get(i));
		//ystem.out.println("3rd Student marks:"+marks.get(2));			
		}
		System.out.println("3rd Student marks:"+marks.get(2));
		Collections.sort(marks);
		sc.close();
	}

}
