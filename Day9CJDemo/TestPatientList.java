import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Patient implements Comparable<Patient>{
	private int patientID;
	private String name;
	private int age;
	Patient(){
		
	}
	Patient(int patientID,String name,int age){
		this.patientID=patientID;
		this.name=name;
		this.age=age;
	}
	public int getPatientID() {
		return patientID;
	}
	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Patient o) {
		
		return this.patientID-o.patientID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + patientID;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patientID != other.patientID)
			return false;
		return true;
	}
	
	
}
 class TitleComparator implements Comparator<Patient> {

	@Override
	public int compare(Patient p, Patient p2) {		
		return p.getName().compareTo(p2.getName());
	}
}
public class TestPatientList {

	public static void main(String[] args) {
		Patient p=new Patient(101,"Mohan",22);
		Patient p1=new Patient(103,"Rohan",23);
		Patient p2=new Patient(102,"Sai",25);
		ArrayList<Patient> list=new ArrayList<>();
		list.add(p);
		list.add(p1);
		list.add(p2);
		for(Patient pa:list) {
			System.out.println(pa.getPatientID()+"\t"+pa.getName()+"\t"+pa.getAge());
		}
		Collections.sort(list);
		for(Patient pa:list) {
			System.out.println(pa.getPatientID()+"\t"+pa.getName()+"\t"+pa.getAge());
		}
		Set<Patient> set = new TreeSet<>(new TitleComparator());
		set.add(p);
		set.add(p1);
		set.add(p2);
		for(Patient pa:set) {
			System.out.println(pa.getPatientID()+"\t"+pa.getName()+"\t"+pa.getAge());
		}
	}

}
