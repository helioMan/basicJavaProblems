import java.util.Scanner;

class APGP {
    public static void main(String[] args) {
        System.out.print("Enter the a(first term), d(common difference), and n(number of terms): ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        int termIs = a;
        for (int i = 0; i < n; i++) {
            System.out.print(termIs + " ");
            termIs = termIs + d;
        }
        System.out.print("\n");
        System.out.print("Enter the aGP(first term), rGP(common difference), and nGP(number of terms): ");

        int aGP = sc.nextInt();
        int rGP = sc.nextInt();
        int nGP = sc.nextInt();

        int termHere = aGP;
        for (int i = 0; i < nGP; i++) {
            System.out.print(termHere + " ");
            termHere = termHere * rGP;
        }

        sc.close();
    }
}