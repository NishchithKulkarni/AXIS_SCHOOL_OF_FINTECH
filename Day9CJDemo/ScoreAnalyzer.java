import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
class TestScoreAnalyzer {
	LinkedList<Integer> runsData=new LinkedList<>();
	Iterator<Integer> itr=runsData.listIterator();
	TestScoreAnalyzer(LinkedList<Integer> runsData){
		this.runsData=runsData;
	}
	TestScoreAnalyzer(){}
	
	void addRunsToList(int runsScored) {
		runsData.add(runsScored);
	}
	
	double calcRunRate(int runsScored) {
		return runsScored/50;
	}
	
	int lowestRunsScored() {
		return Collections.min(runsData);
	}
	
	void displayRuns(LinkedList<Integer> runsData) {
		int i;
		while(itr.hasNext()){
			i=itr.next();
			System.out.println(i);
		}
	}
}
public class ScoreAnalyzer{
	public static void main(String[] args) {
	TestScoreAnalyzer score=new TestScoreAnalyzer();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Runs");
	score.addRunsToList(sc.nextInt());
	score.addRunsToList(sc.nextInt());
	score.addRunsToList(sc.nextInt());
	score.addRunsToList(sc.nextInt());
	score.addRunsToList(sc.nextInt());
	System.out.println(score.runsData);
	System.out.println("Runs Scored:");
	System.out.println(score.runsData);
	int count=0,sum=0;
	for(int i:score.runsData) {
		sum=sum+i;
		count+=1;
	}
	System.out.println(score.calcRunRate(sum));
	System.out.println(score.lowestRunsScored());
	System.out.println(count);
	sc.close();
}
}
