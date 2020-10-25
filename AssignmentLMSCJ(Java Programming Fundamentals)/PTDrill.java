import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

class PTDrill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Students");
        int numOfStudents = sc.nextInt();
        int sqrtOddNum = (int) Math.sqrt(numOfStudents);
        if (Math.sqrt(numOfStudents) % 2 == 1) {
            String[] array = new String[numOfStudents];
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.next();
            }

            Arrays.sort(array);

            int count = 0;
            String[][] array2d = new String[sqrtOddNum][sqrtOddNum];
            for (int i = 0; i < sqrtOddNum; i++) {
                for (int j = 0; j < sqrtOddNum; j++) {
                    array2d[i][j] = array[count++];
                }
            }
            // for (int i = 0; i < sqrtOddNum; i++) {
            //     for (int j = 0; j < sqrtOddNum; j++) {
            //         System.out.print(array2d[i][j] + " ");
            //     }
            //     System.out.println();
            // }

            System.out.print("Middle row: ");
            for (int i = 0; i < array2d.length; i++) {
                for (int j = 0; j < array2d.length; j++) {
                    if (i == array2d.length / 2) {
                        System.out.print(array2d[i][j] + " ");
                    }
                }
            }

            System.out.print("\nMiddle column: ");
            for (int i = 0; i < array2d.length; i++) {
                for (int j = 0; j < array2d.length; j++) {
                    if (j == array2d.length / 2) {
                        System.out.print(array2d[i][j] + " ");
                    }
                }
            }

        } else {
            System.out.println("Enter appropriate number");
        }
    }
}
