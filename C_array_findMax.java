class C_array_findMax {
    public static void main(String[] args) {
        int[] A = { 34, 89, 56, 90, 134, 456 };
        int maxElement = A[0];
        for (int i = 0; i < A.length; i++) {
           if(A[i]>maxElement)
           maxElement = A[i];
        }
        System.out.println("The max element is " + maxElement);
    }
}
