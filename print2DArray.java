import java.util.Scanner;

public class print2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows of the array: ");
        int row = sc.nextInt();
        System.out.print("Enter the columns of the array: ");
        int column = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("["+ i + "," + j + "]" + " ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
