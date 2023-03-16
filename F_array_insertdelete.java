class F_array_insertdelete {
    public static void main(String[] args) {
        int[] A = new int[10];
        A[0] = 1;
        A[1] = 5;
        A[2] = 4;
        A[3] = 10;
        A[4] = 9;
        A[5] = 3;
        for (int i = 0; i < 6; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.print("\n");

        int elementToInsert = 7;
        int indexToSeek = 3;

        for (int i = 6; i > indexToSeek; i--) {
            A[i] = A[i - 1];
        }
        A[indexToSeek] = elementToInsert;

        for (int i = 0; i < 6; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
