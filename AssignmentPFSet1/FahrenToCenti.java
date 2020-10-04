import java.util.Scanner;

class FahrenToCenti {
    public static float convertToCentigrade(int fahren) {
        float centigrade = 0;
        centigrade = (float)(fahren - 32)/9;
        return centigrade*5;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fahren = sc.nextInt();
        if (fahren < 0 ) {
            System.out.println("Invalid Input");
        } else {
            System.out.printf("%.2f" , convertToCentigrade(fahren));
        }
    }
}