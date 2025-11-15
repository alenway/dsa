import java.util.Arrays;

public class StaticArr {
        public static void main(String[] args) {
                // create an array
                int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
                System.out.println(arr.length);

                // Read elements
                for (int i = 0; i < arr.length; i++) {
                        System.out.println(arr[i]);
                }

                // update elements
                arr[6] = 66;

                // delete an element
                int[] arr1 = { 10, 20, 30, 40, 50 };
                System.out.println(Arrays.toString(arr1));
                int index = 2; // remove the element at index 2 (value = 30)

                for (int i = index; i < arr1.length - 1; i++) {
                        arr1[i] = arr1[i + 1];
                }
                arr1[arr1.length - 1] = 0; // optional, clear last element
                System.out.println(Arrays.toString(arr1));
        }
}
