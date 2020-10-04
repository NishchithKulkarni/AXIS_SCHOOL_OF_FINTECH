import java.util.*;
public class Marks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of students");
		int no_of_students=sc.nextInt();
		int [] arr_marks=new int[no_of_students];
		int avg_marks;
		for(int i=0;i<arr_marks.length;i++) {
			arr_marks[i]=sc.nextInt();
		}
		int min_value=arr_marks[0];
		int max_value=arr_marks[0];
		for(int j=0;j<arr_marks.length;j++) {
			if(arr_marks[j]<min_value) {
				min_value=arr_marks[j];
			}
		}
		for(int k=0;k<arr_marks.length;k++) {
			if(arr_marks[k]> max_value) {
				max_value=arr_marks[k];
			}
		}
		int sum=0;
		for(int i=0;i<arr_marks.length;i++) {
			sum+=arr_marks[i];
		}
		avg_marks=sum/no_of_students;
		System.out.println("Minimum marks : "+min_value);
		System.out.println("Maximum marks : "+max_value);
		System.out.println("Average marks : "+avg_marks);
	}

}
