// Write a Java program to handle an ArithmeticException using try, catch, and finally block

package lab08;

public class ARE {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
