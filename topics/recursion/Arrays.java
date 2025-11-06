public class Arrays {
        public static void printing(int[] arrays, int index) {
                if (index == arrays.length) {
                        return;
                }
                System.out.println(arrays[index]);
                printing(arrays, index + 1);
        }

        public static void main(String[] args) {
                int[] arrays = { 2, 3, 4, 5, 6, 6, 7, 7, 2, 3, 1 };
                printing(arrays, 0);
        }
}
