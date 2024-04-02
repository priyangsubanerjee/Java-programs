class Rectangle {
    float length, breadth;

    Rectangle(float l, float b) {
        this.length = l;
        this.breadth = b;
    }
    
    float area() {
        return this.length * this.breadth;
    }


    float perimeter() {
        return 2 * (this.length + this.breadth);
    }
    

}


public class CalculateRect {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(30, 40);

        System.out.println("Area of 1st rect: " + r1.area());
        System.out.println("Area of 2nd rect: " + r2.area());
    }    
}
