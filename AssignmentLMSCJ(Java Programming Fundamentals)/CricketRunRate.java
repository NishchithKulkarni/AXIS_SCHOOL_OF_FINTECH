import java.util.Scanner;
public class CricketRunRate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of overs bowled so far");
		int overs=sc.nextInt();
		System.out.println("Enter the current run rate");
		float cur_run_rate=sc.nextFloat();
		System.out.println("Enter the target score");
		int target=sc.nextInt();
		float req_run_rate;
		req_run_rate=(target-(cur_run_rate*overs))/(50-overs);
		System.out.printf("Required run rate is %.2f",+req_run_rate);
		
	}

}
