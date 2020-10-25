import java.math.*;
class MyUtil{
	public static double throwDice(){
		return Math.random()*6;
	}
	public static int findAverage(int[] array ) {
		int sum=0,avg=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		avg=sum/array.length;
		return avg;
	}
}
public class TestMyUtil {

	public static void main(String[] args) {
		System.out.println(Math.round(MyUtil.throwDice()));
		int [] array1= {1,2,3,4,5};
		int [] array2= {11,12,13,14,15};
		System.out.println("Average array1:"+MyUtil.findAverage(array1));
		System.out.println("Average array1:"+MyUtil.findAverage(array2));
		System.out.println("Max :" + Math.max(10.5, 20.6));
		System.out.println("Min :" + Math.min(10.5, 20.6));
		System.out.println("Ceil :" + Math.ceil(10.5));
		System.out.println("Floor :" + Math.floor(10.5));
		System.out.println("Round :" + Math.round(10.6));
	}

}
