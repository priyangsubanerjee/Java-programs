class Plastic2D {

    int length, breadth = 0;
    int pricePerSqFt = 40;

    int cost() {
        return length * breadth * pricePerSqFt;
    }

}

class Plastic3D extends Plastic2D {
    int height = 0;
    int pricePerCubicFt = 60;

    int cost() {
        int l = super.length;
        int b = super.breadth;
        return l * b * height * pricePerCubicFt;
    }
    public static void main(String[] args) {
        
        Plastic3D p = new Plastic3D();
        p.length = 10;
        p.breadth = 20;
        p.height = 30;
        System.out.println(p.cost());


        Plastic2D p2 = new Plastic2D();
        p2.length = 10;
        p2.breadth = 20;
        System.out.println(p2.cost());

    }
}
