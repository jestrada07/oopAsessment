package workforce;

public class SalariedEmployee extends Employee {
    private double salary;
    private int daysInYear = 365;
    private int daysInWeek = 7;
    private double weeklyPay;
    private final double employeeDiscount = 0.1;


    public SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
        this.weeklyPay = this.salary / this.daysInYear * this.daysInWeek;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    @Override
    public void printBadge() {

        System.out.println("Hourly Employee: " + this.getName() + "\n"
        + "Employee ID: " + this.getId());

    }

    @Override
    public void printCalculatedPay() {
        System.out.println("Salaried Employee's pay is: $" + this.weeklyPay);


    }

    @Override
    public void printItemDiscount(double itemPrice) {


        System.out.println("Salaried Employee's discount is: $" + this.employeeDiscount * itemPrice );
    }
}
