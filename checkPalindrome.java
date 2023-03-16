import java.util.Scanner;

class checkPalindrome {
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
        if (reverseNumber == tempNumber) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
        sc.close();
    }
}