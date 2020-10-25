package exceptionAssignments;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class AgeCalculator2 {
	public double calculateAge(String dob) throws InvalidDOBException, ParseException {
		Date currentdate = new Date();
		long currentmillis = currentdate.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse(dob);
		System.out.println(date);
		long dobmillis = date.getTime();
		long agemillis = currentmillis - dobmillis;
		if(agemillis < 0)
		{
			throw new InvalidDOBException();
		}
		double years = agemillis/1000/60/60/24/366;
		return years;
	}
	public static void main(String[] args) throws InvalidDOBException, ParseException {
		AgeCalculator2 ac= new AgeCalculator2(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Date of Birth :");
		String DOB = sc.nextLine();
		try {
			System.out.println(ac.calculateAge(DOB));;
		}
		finally {
			sc.close();
		}
		//System.out.println("DONE");
	}

	}
