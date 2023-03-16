import java.util.Scanner;

class countDigits {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int countDigits = 0;

        // you divide the number by 10 and increase the countDigits varible
        while (number > 0) {
            number = number / 10;
            countDigits++;
        }
        System.out.println("Total digits are: " + countDigits);

        sc.close();
    }
}