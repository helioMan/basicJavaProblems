import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;

        System.out.print("Enter the number to calculate fibonacci till: ");
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        System.out.print(a+ " " + b + " ");
        for (int i = 2; i < num; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        sc.close();
    }
}
