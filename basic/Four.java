import java.util.Scanner;

public class Four {

  // Convert integer to binary
  public static String integerToBinary(int number) {
    return Integer.toBinaryString(number);
  }

  // Convert binary to integer
  public static int binaryToInteger(String binary) {
    return Integer.parseInt(binary, 2);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Integer to Binary Conversion
    System.out.print("Enter an integer: ");
    int integerInput = scanner.nextInt();
    String binaryResult = integerToBinary(integerInput);
    System.out.println("Binary representation: " + binaryResult);

    // Binary to Integer Conversion
    System.out.print("Enter a binary number: ");
    String binaryInput = scanner.next();
    int integerResult = binaryToInteger(binaryInput);
    System.out.println("Integer representation: " + integerResult);

    scanner.close();
  }
}
