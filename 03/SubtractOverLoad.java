// Write a program to overload subtract method with various parameters in a class in Java. Write the driver classes to use the different subtract methods using object.

class Subtract {
    public int subtract(int a, int b) {
        return a - b;
    }

    public int subtract(int a, int b, int c) {
        return a - b - c;
    }

    public int subtract(int a, int b, int c, int d) {
        return a - b - c - d;
    }
}

public class SubtractOverLoad {
    public static void main(String[] args) {
        Subtract s = new Subtract();
        System.out.println("Subtracting 2 numbers: " + s.subtract(10, 5));
        System.out.println("Subtracting 3 numbers: " + s.subtract(10, 5, 3));
        System.out.println("Subtracting 4 numbers: " + s.subtract(10, 5, 3, 2));
    }
}
