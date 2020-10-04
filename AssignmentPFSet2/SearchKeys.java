import java.util.Scanner;

public class SearchKeys {
	static int [] found;
	public static void searchkeys(int arr[],int size,int element) {
		//int element;
		int ind=0;
		int [] temp=new int[20];
		for(int i=0;i<=size;i+=2) {
			if(element==arr[i]) {
				temp[ind++]=arr[i-1];
			}
		}
		found=new int[ind];
		for(int j=0;j<ind;j++) {
			found[j]=temp[j];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<1) {
		System.out.println("Invalid Array Size"); 
		System.exit(0);
		}
	
	int [] arr=new int[n];
	for(int i=0; i<n ; i++) {
		arr[i]=sc.nextInt();
		if(arr[i]<0) {
			System.out.println("Invalid input");
			System.exit(0);
		}
	}
int elements=sc.nextInt();
searchkeys(arr,n,elements);
for(int i:found) {
	System.out.println(i);
}
sc.close();
}
}
