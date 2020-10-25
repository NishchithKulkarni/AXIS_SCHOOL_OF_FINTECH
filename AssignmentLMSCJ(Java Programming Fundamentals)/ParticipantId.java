import java.util.Scanner;
public class ParticipantId {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of participants");
		int no_of_participants=sc.nextInt();
		int[] arr=new int[no_of_participants];
		System.out.println("Enter the participants");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter ID to search");
		int idToSearch=sc.nextInt();
		boolean result=false;
		for(int element:arr) {
			if(element==idToSearch) {
				result=true;
				break;
			}
		}
		if(result) {
			System.out.println("Participant with ID"+" "+idToSearch+" " +"exists");
		}
		else {
			System.out.println("Participant with ID"+" "+idToSearch+" " +"doesn't exists");
		}
	}

}
