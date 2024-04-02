class Base {
    public void print() {
        System.out.print("D");
        System.out.print("B");
    }

}


class Derived extends Base {
    public void print() {
        System.out.print("B");
        System.out.print("D");
    }
}

public class TestClass {

    public static void DoPrint(Base o) {
        o.print();
        o.print();
    }
    public static void main(String[] args) {
        System.out.println((12345678/25.0) * Integer.parseInt("50") + 5);

        
    }
}
