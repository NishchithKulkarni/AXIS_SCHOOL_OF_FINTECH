import java.util.Scanner;
public class CricketId {
	public static int findCricketerId(int array[],int size,int score) {
		for(int i=0;i<array.length;i=i+2) {
			if(array[i]>score) {
				System.out.println(array[i-1]);
			}
		}	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int [] arr=new int[size];
		int score=sc.nextInt();
		if(size<0) {
			System.out.println("Invalid array size");
			System.exit(0);
		}
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]<0) {
				System.out.println("Invalid input");
				System.exit(0);
			}
		}
		if(score<0) {
			System.out.println("Invalid score");
		}
		System.out.println(findCricketerId(arr,size,score));
		
	}

}
