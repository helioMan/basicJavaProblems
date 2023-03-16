import java.util.Scanner;

class printNumberInWords {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int r;

        String str = "";
        while (number > 0) {
            r = number % 10;
            number = number / 10;
            str = str + r; // remove the digit and concatenate into the empty string
        }
        System.out.println(str);

        // get character at the current index and print the equivalent word using the
        // swith case
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            switch (c) {
                case '0':
                    System.out.print("zero" + " ");
                    break;
                case '1':
                    System.out.print("one" + " ");
                    break;
                case '2':
                    System.out.print("two" + " ");
                    break;
                case '3':
                    System.out.print("three" + " ");
                    break;
                case '4':
                    System.out.print("four" + " ");
                    break;
                case '5':
                    System.out.print("five" + " ");
                    break;
                case '6':
                    System.out.print("six" + " ");
                    break;
                case '7':
                    System.out.print("seven" + " ");
                    break;
                case '8':
                    System.out.print("eight" + " ");
                    break;
                case '9':
                    System.out.println("nine");
                    break;
            }
        }
        sc.close();
    }
}