import java.util.*;
public class MultiplesOfFive {
public static float findAverageBy5(int n){
	float sum=0,count=0;
	for (int i=5;i<=n;i+=5)
	{
		sum += i;
		count++;
	}
	return sum/count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0) 
		{
			System.out.println("Invalid Input"); 
			System.exit(0);
			}
		if(n>32767)
		{System.out.println("Number too large");
		System.exit(0);
		}
		System.out.printf("%.2f",findAverageBy5(n));
		sc.close();
	}

}
