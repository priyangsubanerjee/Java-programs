
class A {
    int a = 90;
}

class B extends A {
    int a = 150;
}

class MultipleInheritance {
    public static void main(String[] args) {
        A obj = new B();
        System.out.println(obj.a);
    }
}
