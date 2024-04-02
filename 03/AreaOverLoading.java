import java.util.Scanner;

class Object {
    float length, breadth, height, base;    

     public float area(float s) {
        return s * s;
    }

    public float area(float b, float h) {
        return 0.5f * b * h;
    }
    
    public float area(float r, float h, float j) {
        return 2 * 22 / 7 * r;
    }
}

public class AreaOverLoading {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                float radius;
                System.out.print("Enter radius of circle: ");
                radius = sc.nextFloat();
                Object c = new Object();
                System.out.println(c.area(radius, 0, 0));
                sc.close();
                break;

            case 2:
                float height, base;
                System.out.print("Enter base, height of triangle: ");
                height = sc.nextFloat();
                base = sc.nextFloat();
                Object t = new Object();
                System.out.println("Base: " + base);
                System.out.println("Height: " + height);
                System.out.println(t.area(base, height));
                sc.close();
                break;

            case 3:
                float side;
                System.out.print("Enter side, of square: ");
                side = sc.nextFloat();
                Object s = new Object();
                System.out.println(s.area(side));
                sc.close();
        
            default:
                break;
        }
    }
}
