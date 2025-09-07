import java.util.Scanner;

public class Unikearray {

    // Method to create array of N unique integers summing to zero
    public static int[] CreateArray(int n) {
        int[] newArr = new int[n];
        int index = 0;

        // If n is odd, include 0
        if (n % 2 == 1) {
            newArr[index++] = 0;
        }

        // Add pairs of positive and negative numbers, starting from 1
        for (int i = 1; i <= n / 2; i++) {
            newArr[index++] = i;
            newArr[index++] = -i;
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length: ");
        int n = scan.nextInt();
        int[] arr = CreateArray(n);

        // Print the array
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        scan.close();
    }
}
