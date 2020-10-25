import java.util.Scanner;
public class CalculateSal {
	public static int calculateSal(int salary,int shifts) {
		double food=0;
		double travel=0;
		double savings=0;
		double totalSalary=0;
		food=0.2*salary;
		travel=0.3*salary;
		totalSalary=salary+(0.02*shifts);
		if(salary>8000) {
			System.out.println("Salary too large");	
		}
		else if(salary<0) {
			System.out.println("Salary too small");
		}
		else {
			savings=totalSalary-(food+travel);
			
		}
		int saving=(int)savings;
	return saving;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sal=sc.nextInt();
		int shift=sc.nextInt();
		System.out.println(calculateSal(sal,shift));
	}

}
