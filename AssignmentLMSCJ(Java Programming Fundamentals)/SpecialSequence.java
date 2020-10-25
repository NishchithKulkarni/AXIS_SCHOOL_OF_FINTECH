import java.util.Scanner;
class SpecialSequence {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 1;
        int n3 = 3;
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        int num = 20;
        System.out.print(n1 + " " + n2 + " " + n3 + " ");
        while (temp < num) {
            temp = n1 + n2 + n3;
            n1 = n2;
            n2 = n3;
            n3 = temp;
            if (temp < num) {
                System.out.print(temp + " ");
            }
        }
    }
}