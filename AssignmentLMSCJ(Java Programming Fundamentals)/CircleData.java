import java.util.Scanner;
import java.lang.Math.*;
public class CircleData {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		float radius=sc.nextFloat();
		System.out.println("Enter Output required");
		String out_code=sc.next();
		switch(out_code) {
		case "DIA": 
			float diameter=2*radius;
			System.out.printf("Diameter of circle is %.2f",+diameter);
			break;
		case "AR": System.out.printf("Area of circle is %.2f",+Math.PI*radius*radius);
		break;
		case "PER": System.out.printf("Perimter of circle is %.2f",+Math.PI*2*radius);
		break;
		case "ARSEM": System.out.printf("Area of  Semi circle is %.2f", +Math.PI*radius);
		break;
		default:
			System.out.println("Enter the proper input");
		}
	}

}
