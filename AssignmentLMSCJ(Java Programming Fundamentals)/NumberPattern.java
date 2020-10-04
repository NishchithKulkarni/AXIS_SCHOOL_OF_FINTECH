import java.util.Scanner;
public class NumberPattern {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%3!=0) {
				System.out.print(i+" ");
				
			}
			}
			if(i%3!=0) {
		System.out.println();
		}
		}

	}

}
