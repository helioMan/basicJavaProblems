import java.util.Scanner;

class reverseANumber {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int tempNumber = number;
        int reverseNumber = 0;
        int r;
        while (number > 0) {
            r = number % 10;
            reverseNumber = reverseNumber * 10 + r;
            number = number / 10;
        }

        System.out.println("Reverse of " + tempNumber + " is " + reverseNumber);
        sc.close();
    }
}