import java.util.Scanner;

class Box{

    float length, breadth, height;

    Box(float l, float b, float h) {
        this.length = l;
        this.breadth = b;
        this.height = h;
    }


    float volume() {
        return this.length * this.breadth * this.height;
    }
}

public class VolumeOfBox {
    public static void main(String[] args) {
        float l, b, h;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length, breadth and height of the box: ");
        l = sc.nextFloat();
        b = sc.nextFloat();
        h = sc.nextFloat();
        sc.close(); 
        Box b1 = new Box(l, b, h);
        System.out.println("Volume of the box: " + b1.volume());
    }
}
