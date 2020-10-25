import java.util.*;
public class PassCount {
	public static int passCount(int arr[],int size) {
		int cnt=0;
		for(int i=0;i<arr.length;i+=2) {
			if(arr[i]>70) {
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 if(n%2!=0) {
			 System.out.println("Invalid Size");
			 System.exit(0);
		 }
		 int [] arr=new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
			 if(arr[i]<1) {
				 System.out.println("Invalid input");
				 System.exit(0);
			 } 
		 }
		 System.out.println(passCount(arr,n));
	}

}
