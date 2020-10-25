import java.util.Scanner;
public class CountOfThreeMultiples {
public static int divisibleBy3(int arr[],int size) {
	int cnt=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%3==0) {
			cnt++;
		}
	}
	return cnt;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		if(size<0) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		int [] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]<0) {
				System.out.println("Invalid input");
				System.exit(0);
			}
		}
		System.out.println(divisibleBy3(arr,size));
	}

}
