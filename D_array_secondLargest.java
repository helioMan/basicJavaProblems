class D_array_secondLargest {
    public static void main(String[] args) {
        int[] A = { 34, 89, 56, 90, 134, 456, 430 };
        int maxElement1 = A[0];
        int maxElement2 = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > maxElement1) {
                maxElement2 = maxElement1;
                maxElement1 = A[i];
            } else if (A[i] > maxElement2) {
                maxElement2 = A[i];
            }
        }
        System.out.println("The max element is " + maxElement2);
    }
}
