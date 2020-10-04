import java.util.*;
public class maximumSum {
	public static int maxSum(int numbers[],int size) {
		int evensum=0,oddsum=0;
		for(int i=0;i<size;i++) {
			if(numbers[i]%2==0) {
				evensum=evensum+numbers[i];
			}
			else {
				oddsum=oddsum+numbers[i];
			}
		}
		if(evensum>oddsum) {
			return evensum;
		}
		else {
			return oddsum;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		if(size<0) {
			System.out.println("Invalid array size");
			System.exit(0);
		}
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]<1) {
				System.out.println("Invalid input");
				System.exit(0);
			}
		}
		
		System.out.println(maxSum(arr,size));
	}
	

}
