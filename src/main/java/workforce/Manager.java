package workforce;

public class Manager extends Employee {
    private final double managerDiscount = 0.15;

    public Manager(String name) {
        super(name);
    }

    @Override
    public void printBadge() {

    }

    @Override
    public void printCalculatedPay() {

    }

    @Override
    public void printItemDiscount(double itemPrice) {

        System.out.println("Managers discount is: $" + this.managerDiscount * itemPrice);


    }
}
