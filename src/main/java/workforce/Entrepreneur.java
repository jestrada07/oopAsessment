package workforce;

public class Entrepreneur extends Person implements IPayable {
    private double salary;
    private double expenses;
    private double revenue;
    private double profit;
    private double discount = 0.02;

    public Entrepreneur(String name,double revenue, double expenses) {
        super(name);
        this.revenue = revenue;
        this.expenses = expenses;
        this.salary = salary;
        this.profit = this.revenue - this.expenses;


    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    @Override
    public String toString() {
        return "Entrepreneur{name is" + this.getName() +"," + "revenue is: $" + this.revenue +","
        + "expenses are: $" + this.expenses + '}';
    }

    @Override
    public void printCalculatedPay() {
        System.out.println("Entrepreneur's pay is: $" + this.profit);

    }

    @Override
    public void printItemDiscount(double itemPrice) {

        System.out.println("Entrepreneur's discount is: $" + this.discount * itemPrice);



    }
}
