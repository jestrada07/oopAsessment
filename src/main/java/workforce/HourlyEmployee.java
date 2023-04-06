package workforce;

public class HourlyEmployee extends Employee  {
    private double hoursWorked;
    private double rate;
    private double pay;
    private final double employeeDiscount = 0.1;

    public HourlyEmployee(String name, double rate, double hoursWorked) {
        super(name);
        this.rate = rate;
        this.hoursWorked = hoursWorked;
        this.pay = this.rate * this.hoursWorked;

    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRate() {

        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }





    @Override
    public void printBadge() {
        System.out.println("Salaried Employee: " + this.getName() + "\n"
                + "Employee ID: " + this.getId());

    }

    @Override
    public void printCalculatedPay() {

        System.out.println("Hourly Employee's pay is: $" + this.pay);


    }

    @Override
    public void printItemDiscount(double itemPrice) {

        System.out.println("Hourly Employee's discount is: $" + this.employeeDiscount * itemPrice);




    }
}
