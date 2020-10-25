import java.util.*;
public class ProfitLoss {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers of dozens of egg purchased");
		double no_of_dozens=sc.nextInt();
		System.out.println("Enter the price per dozen");
		double price_per_dozen=sc.nextInt();
		System.out.println("Enter the selling price of 1 egg");
		double sp_1_egg=sc.nextFloat();
		double cp_1_egg=(price_per_dozen/12);
		double gain=sp_1_egg-cp_1_egg;
		double profit_percentage=((gain)/(cp_1_egg))*100;
		System.out.printf("%.2f",+profit_percentage);
	}
}
