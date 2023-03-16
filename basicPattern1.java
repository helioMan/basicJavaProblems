import java.util.*;

public class basicPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows of the array: ");
        int row = sc.nextInt();
        System.out.print("Enter the columns of the array: ");
        int column = sc.nextInt();

        /*
         * 1 2 3 4 5
         * 1 2 3 4 5
         * 1 2 3 4 5
         * 1 2 3 4 5
         * 1 2 3 4 5
         * 
         */
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }

        /*
         * 1 1 1 1 1
         * 2 2 2 2 2
         * 3 3 3 3 3
         * 4 4 4 4 4
         * 5 5 5 5 5
         */

        System.out.print("\n");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }

        /*
         * 2 3 4 5 6
         * 3 4 5 6 7
         * 4 5 6 7 8
         * 5 6 7 8 9
         * 6 7 8 9 10
         */
        System.out.print("\n");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print((i + j) + " ");
            }
            System.out.print("\n");
        }

        /*
         * 1 2 3 4 5
         * 6 7 8 9 10
         * 11 12 13 14 15
         * 16 17 18 19 20
         * 21 22 23 24 25
         */
        System.out.print("\n");
        int countCells = 0;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                countCells++;
                System.out.printf("%3d", countCells);
            }
            System.out.print("\n");
        }

        sc.close();
    }
}
