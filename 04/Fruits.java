// Write a program in Java having three classes Apple, Banana and Cherry. Class Banana and Cherry are inherited from class Apple and each class have their own member function show() . Using Dynamic Method Dispatch concept display all the show() method of each class



class Apple {

    void show() {
        System.out.println("Apple");
    }

}

class Banana extends Apple {
    void show() {
        System.out.println("Banana");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("Cherry");
    }
}


public class Fruits {
    public static void main(String[] args) {
        Apple a = new Banana();
        Apple b = new Cherry();
        Apple d = new Apple();
        a.show();
        b.show();
        d.show();
    }
}
