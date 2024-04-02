// Write a Java program to generate an ArrayIndexOutofBoundsException and handle it using catch statement

package lab08;

public class AOBE {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
