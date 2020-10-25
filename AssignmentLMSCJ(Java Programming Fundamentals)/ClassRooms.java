import java.util.*;
public class ClassRooms {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter C1 capacity");
		int c1=sc.nextInt();
		System.out.println("Enter C2 capacity");
		int c2=sc.nextInt();
		System.out.println("Enter C3 capacity");
		int c3=sc.nextInt();
		System.out.println("Enter no of students");
		int no_of_students=sc.nextInt();
		int incr=0;
		if(no_of_students<=c1) {
			incr++;
		}
		if(no_of_students<=c2) {
			incr++;
		}
		if(no_of_students<=c3) {
			incr++;
		}
		if(incr>0) {
		System.out.println(incr+"labs can accomodate"+" "+no_of_students+"students");
		}
		else
		{
			System.out.println("None of the labs can accomodate"+" "+no_of_students+"students");
		}

}
}
