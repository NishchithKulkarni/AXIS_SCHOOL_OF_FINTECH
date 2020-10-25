package exceptionAssignments;
public class ExceptionTest {
	public static void main(String[] args) {
		try {
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		System.out.println("Result :" +num1/num2);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

