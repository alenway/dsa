public class SumTwoD {
    public static int arraySum(int[][] arr) {
        int col = arr.length;
        int row = arr[0].length;
        int sum = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[i][j] + " ");
                sum = sum + arr[i][j];
            }
            System.out.println();
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = { { 4, 5, 6, 1 },
                { 2, 3, 2, 1 },
                { 1, 2, 6, 7 } };
        System.out.println(arraySum(arr));
        // System.err.println(arr[0].length + " " + arr.length);
    }
}
