interface motor {
    int capacity = 100;
    void run();
    void consume();
}


class WashingMachine implements motor {

    public void run() {
        System.out.println("Washing Machine is running");
    }

    public void consume() {
        System.out.println("Washing Machine is consuming " + capacity + " watts");
    }
}

class MotorInterface {
    
    public static void main(String[] args) {
        motor w = new WashingMachine();
        w.run();
        w.consume();
    }
}
