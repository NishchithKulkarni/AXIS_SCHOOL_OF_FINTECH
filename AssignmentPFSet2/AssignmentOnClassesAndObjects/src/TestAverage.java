class Averager{
	public static double avg(int a,int b) {
		return (a+b/2);
	}
	public static double avg(int a,int b,int c) {
		return (a+b+c/2);
	}
	public static double avg(double a,double b) {
		return (a+b/2);
	}
}
public class TestAverage {
	public static void main(String[] args) {
		System.out.println(Averager.avg(1,2));
		System.out.println(Averager.avg(1,2,3));
		System.out.println(Averager.avg(1.2,3.4));
	}

}
