public class VSumTwoD {
    public static void sumH(int[][] arr) {
        int col = arr.length;
        int row = arr[0].length;
        int sum = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println(sum);
            sum = 0;
        }
    }

    public static void sumV(int[][] arr) {
        int col = arr.length;
        int row = arr[0].length;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum = sum + arr[j][i];
            }
            System.out.print(sum + " ");
            sum = 0;
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 4, 5, 6, 1 },
                { 2, 3, 2, 1 },
                { 1, 2, 6, 7 } };

        sumH(arr);
        sumV(arr);
    }
}
