abstract class CarA {
    abstract void changeGear();
    void startEngine() {
        System.out.println("Engine started");
    }
}

 class Manual extends CarA {
    void changeGear() {
        System.out.println("Gear changed in manual car");
    }
}

 class Automatic extends CarA {
    @Override
    public void changeGear() {
        throw new UnsupportedOperationException("Gear change not supported in automatic car");
    }
}

 class Car {

    public static void main(String[] args) {
        CarA manualCar = new Manual();
        CarA automaticCar = new Automatic();

        manualCar.startEngine();
        automaticCar.startEngine();

        manualCar.changeGear(); // This call is valid
        automaticCar.changeGear(); // This call will result in a compile-time error

        manualCar.startEngine();
        automaticCar.startEngine();
    }
}
