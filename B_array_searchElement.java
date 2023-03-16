import java.util.Scanner;

class B_array_searchElement {
    public static void main(String[] args) {
        int[] A = { 34, 89, 56, 90, 134, 456 };
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element to find: ");
        int elementToFind = sc.nextInt();
        for (int i = 0; i < A.length; i++) {
            if (elementToFind == A[i]) {
                System.out.println("Element is found");
                System.exit(0);
            }
        }
        System.out.println("Element is not found");
        sc.close();
    }
}
