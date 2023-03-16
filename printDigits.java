import java.util.Scanner;

class printDigits {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int numberToPrint;

        while (number > 0) {
            numberToPrint = number % 10;
            number = number / 10;

            System.out.print(numberToPrint + " ");
        }

        sc.close();
    }
}