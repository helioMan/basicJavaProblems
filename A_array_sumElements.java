class A_array_sumElements {
    public static void main(String[] args) {
        int A[] = { 2, 3, 4, 5, 6 };
        int sumOfElements = 0;
        for (int i = 0; i < A.length; i++) {
            sumOfElements += A[i];
        }
        System.out.println("The sum of elements is: " + sumOfElements);
    }
}
