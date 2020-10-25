import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ScoreCard {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Runs");
		for(int i=0;i<=10;i++) {
		map.put(sc.nextLine(), sc.nextInt());
		}
		
		Set<String> set=map.keySet();
		System.out.println("Players who batted");
		System.out.println(set);
		System.out.println("Score by Players");
		for(Entry<String, Integer> map1:map.entrySet()) {
			System.out.println(map1.getKey()+"\t"+map1.getValue());
		}
		int sum=0;
		Collection<Integer> scores = map.values();
		for(Integer score : scores) {
			sum+=score;
		}
		System.out.println("Total Score"+sum);
		Collections.max(map.values());
		System.out.println("Name of Highest Scorer:"+Collections.max(map.values()));
		//System.out.println("Runs scored by Dhoni: "+map.getValue(Dhoni));
		sc.close();
	}
}