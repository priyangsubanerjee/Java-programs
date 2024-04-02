package lab6.general;

public class employee {
    protected int empid;
    private String ename;


    public employee(int id, String name) {
        this.empid = id;
        this.ename = name;
    }

    public double earning(int salary) {
        double DA = 0.8 * salary;
        double HRA = 0.15 * salary;
        double earning = salary + DA + HRA;
        System.out.println("Earnings: " + earning);
        return earning;
    }

}
