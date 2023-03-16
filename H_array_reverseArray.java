class H_array_reverseArray {
    public static void main(String[] args) {
        int[] originalArray = { 1, 5, 8, 4, 6, 7, 9, 3 };
        int[] reversedArray = new int[originalArray.length];

        for (int i = originalArray.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = originalArray[i];
        }

        System.out.print("Original array is: ");
        for (int x : originalArray) {
            System.out.print(x + " ");
        }

        System.out.print("\n");

        System.out.print("Reversed array is: ");
        for (int y : reversedArray) {
            System.out.print(y + " ");
        }

    }
}
