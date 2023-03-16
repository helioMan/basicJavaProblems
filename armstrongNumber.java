import java.util.Scanner;

class armstrongNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int tempNumber = number;
        int r;
        int sumOfCubeDigits = 0;
        while (number > 0) {
            r = number % 10;
            sumOfCubeDigits = sumOfCubeDigits + (r * r * r);
            number = number / 10;
        }
        if (tempNumber == sumOfCubeDigits) {
            System.out.println("The number is an armstrong number");
        } else {
            System.out.println("The number is not an armstrong number ");
        }
        sc.close();
    }
}