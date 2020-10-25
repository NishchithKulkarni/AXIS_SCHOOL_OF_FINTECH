package exceptionAssignments;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class AgeCalculator1 {
	public double calculateAge(String dob) throws ParseException {
		Date currentdate=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		long currentmillis=currentdate.getTime();
		Date date=sdf.parse(dob);
		System.out.println(date);
		long dobmillis=date.getTime();
		long agemillis=currentmillis-dobmillis;
		double years=agemillis/1000/60/60/24/366;
		return years;
	
	
}
public static void main(String args[]) {
	AgeCalculator1 ac= new AgeCalculator1(); 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Date of Birth :");
	String DOB = sc.nextLine();
	try {
		System.out.println(ac.calculateAge(DOB));;
	} catch (ParseException e) {
		System.out.println("Date should be in DD/MM/YYYY format only");
		e.printStackTrace();
	}
	finally {
		sc.close();
	}
	System.out.println("DONE");
}
}
