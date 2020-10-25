import java.util.*;
public class ProductOfDigits {
	public static int productDigits(int kms) {
		int rem=0,product=1;
		if(kms<0 || kms>32767) {
			return -1;
		}
		else
		{
		while(kms!=0){
			rem=kms%10;
			kms=kms/10;
			product=product*rem;
		}
			return product;
		
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int kms=sc.nextInt();
		productDigits(kms);
		if(productDigits(kms)==1) {
			System.out.println("Invalid input");
		}
		else {
		System.out.println(productDigits(kms));
	}
}

}
