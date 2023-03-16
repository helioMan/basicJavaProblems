class G_array_copyArray {
    public static void main(String[] args) {
        int[] A = { 2, 9, 5, 4, 0, 1, -1, 4 };

        int[] temp = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            temp[i] = A[i];
        }

        for (int x : temp) {
            System.out.print(x + " ");
        }
    }
}
