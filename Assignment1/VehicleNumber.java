import java.util.Scanner;
class VehicleNumber {
    public static int sum(int i) {
        int rem = 0;
        int sum = 0;
        while (i > 0) {
            rem = i % 10;
            i = i / 10;
            sum = sum + rem;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println();
        for (int i = m; i <= n; i++) {
            if (sum(i) == 9) {
                System.out.println(i);
            }
        }
    }
}