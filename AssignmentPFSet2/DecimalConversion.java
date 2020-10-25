import java.util.Scanner;

public class DecimalConversion {
	static boolean isBinary(int n)
	{
		int temp = n;
		while(temp>0)
		{
			int digit = temp%10;
			if(digit>1)
			{
				return false;
			}
			temp /= 10;
		}
		return true;
		
	}
	public static int decimalConvert(int n) {
		int rem=0;
		if(n<1 || isBinary(n)) {
			return -1;
		}
		int i=0;
		double sum=0;
		while(n>0) {
			rem=n%10;
			sum=sum+rem*Math.pow(2, i++);
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=decimalConvert(n);
		if(res==-1) {
			System.out.println("Invalid input");
		}
		else {
			System.out.println(res);
		}
		sc.close();
	}

}
