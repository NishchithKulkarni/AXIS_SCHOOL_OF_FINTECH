import java.util.Scanner;

class OddEvenAverage {
    public static float avgOddEvenSum(int array[], int size) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (sum/size);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size < 0) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i] < 0) {
            	
                System.out.println("Invalid Input");
                System.exit(0);
            }
        }
        System.out.printf("%.2f", avgOddEvenSum(array, size));
    }
}