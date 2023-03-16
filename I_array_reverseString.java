class I_array_reverseString {
    public static void main(String[] args) {
        String originalString = "redemption";
        String reversedString = "";

        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + originalString.charAt(i);
        }

        System.out.println("Original string is: " + originalString);
        System.out.println("Reversed string is: " + reversedString);
    }
}
