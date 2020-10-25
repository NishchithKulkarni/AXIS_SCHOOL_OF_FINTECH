import java.util.Scanner;
import java.util.*;
class PowerOfTwo {
    public static boolean powerOfTwo(int n) {
        return n>0 && n==Math.pow(2, Math.round(Math.log(n)/Math.log(2)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Number too small");
        } else if(num > 32767) {
            System.out.println("Number too large");
        } else {
            if (powerOfTwo(num)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}