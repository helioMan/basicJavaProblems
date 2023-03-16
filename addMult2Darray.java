class addMult2Darray {
    public static void main(String[] args) {
        int arrayOne[][] = { { 3, 5, 9 }, { 7, 6, 2 }, { 4, 3, 5 } };
        int arrayTwo[][] = { { 1, 5, 2 }, { 6, 8, 4 }, { 3, 9, 7 } };
        int arrayToOperate[][] = new int[3][3];

        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[0].length; j++) {
                arrayToOperate[i][j] = arrayOne[i][j] + arrayTwo[i][j];
            }
        }
        for (int x[] : arrayToOperate) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.print("\n");
        }

        int C[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    C[i][j] = C[i][j] + arrayOne[i][k] * arrayTwo[k][j];
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.print("\n");

        }

    }
}
