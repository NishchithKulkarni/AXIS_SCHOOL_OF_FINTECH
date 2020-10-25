import java.util.*;
public class ElementCount {
	public static int findElementCount(int arr[],int size,int search)
	{
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        if (size < 0) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i] < 0) {
                System.out.println("Invalid Input");
                System.exit(0);
            }
        }
        int key = sc.nextInt();
        System.out.println(findElementCount(array, size, key));
	}

}
