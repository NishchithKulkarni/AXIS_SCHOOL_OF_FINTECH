import java.util.LinkedHashSet;

public class TestPatientSet {

	public static void main(String[] args) {
		LinkedHashSet<Patient> ll=new LinkedHashSet<>();
		Patient p=new Patient(101,"Mohan",22);
		Patient p1=new Patient(103,"Rohan",23);
		Patient p2=new Patient(101,"Mohan",22);
		ll.add(p);
		ll.add(p1);
		ll.add(p2);
		System.out.println(p.equals(p2));
		System.out.println(ll.size());
		for(Patient pa:ll) {
			System.out.println(pa.getPatientID()+"\t"+pa.getName()+"\t"+pa.getAge());
		}
	}

}
