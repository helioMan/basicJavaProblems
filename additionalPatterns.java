import java.util.*;

public class additionalPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number f rows and columns of the array: ");
        int row = sc.nextInt();
        //int column = sc.nextInt();

        /*
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         */

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }

        /*
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         * 11 12 13 14 15
         */
        System.out.print("\n");
        int count = 0;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                System.out.printf("%3d", count);
            }
            System.out.print("\n");
        }

        /*
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         */

        System.out.print("\n");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }

         /*
          1 2 3 4 5
          1 2 3 4
          1 2 3
          1 2
          1
         */

         System.out.print("\n");
         for (int i = 1; i <= 5; i++) {
             for (int j = 1; j <= 5 - i + 1; j++) {
                 System.out.print(j + " ");
             }
             System.out.print("\n");
         }


         /*
             * * * * *
             * * * *
             * * * 
             * *
             * 
          */
         System.out.print("\n");
         for (int i = 1; i <= 5; i++) {
             for (int j = 1; j <= 5 - i + 1; j++) {
                 System.out.print("*" + " ");
             }
             System.out.print("\n");
         }
        sc.close();
    }
}
