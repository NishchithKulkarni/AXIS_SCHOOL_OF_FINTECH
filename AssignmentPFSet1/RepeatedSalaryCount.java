import java.util.Scanner;
public class RepeatedSalaryCount {
	public static int countRepeaters(int arr[],int size){
		int cnt=0;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]){
					cnt++;
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int [] arr=new int[size];
		for(int k=0;k<size;k++) {
			arr[k]=sc.nextInt();
		}
		System.out.println(countRepeaters(arr,size));     
	}

}
