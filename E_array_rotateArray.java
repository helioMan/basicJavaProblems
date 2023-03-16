class E_array_rotateArray {
    public static void main(String[] args) {
        int[] A = { 2, 3, 6, 9, 1, 0 };
        for (int x : A) {
            System.out.print(x + " ");
        }
        System.out.print("\n");
        int temp = A[0];
        for (int i = 1; i < A.length; i++) {
            A[i - 1] = A[i];
        }
        A[A.length - 1] = temp;

        for (int x : A) {
            System.out.print(x + " ");
        }
    }
}
