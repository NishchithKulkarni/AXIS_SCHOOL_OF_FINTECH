import java.util.Scanner;
public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the previous reading");
		int prev_reading=sc.nextInt();
		System.out.println("Enter the current reading");
		int cur_reading=sc.nextInt();
		double first_thirty_units=0;
		double first_seventy_units=0;
		double bill=0;
		int units_consumed=cur_reading-prev_reading;
		if(units_consumed<=30)
		{
			first_thirty_units=(units_consumed*2.3);
			System.out.println(first_thirty_units);
		}
		if(units_consumed>30 && units_consumed<=70)
		{
			first_seventy_units=(30*2.3)+((units_consumed-30)*3.5);
			System.out.println(first_seventy_units);
		}
		int remaining=units_consumed-100;
		if(units_consumed>100 && units_consumed<=999)
		{
			bill=(30*2.3)+(70*3.5)+(remaining*4.6);
		}
		System.out.printf("Bill amount is %.2f",+ bill);
	}

}
