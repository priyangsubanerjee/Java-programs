
abstract class Student1 {
    
    int roll, reg;

    void getInput(int roll, int reg) {
        this.roll = roll;
        this.reg = reg;
    }

    void display() {
        System.out.println("Roll: " + roll + "\nReg: " + reg);
    }
    
}

class KiiTian extends Student1 {

    String branch;
    KiiTian(int roll, int reg) {
        super.getInput(roll, reg);
        this.branch = 
        "B.Tech CSE";
    }

    void display() {
        super.display();
        System.out.println("Branch: " + branch);
    }

    void course() {
        System.out.println(this.branch);
    }

}

public class Student{
    public static void main(String[] args) {
        KiiTian k = new KiiTian(12934, 22031335);
        k.display();
    }
}