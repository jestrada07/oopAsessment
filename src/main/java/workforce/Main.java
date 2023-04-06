package workforce;

public class Main {


    public static void main(String[] args) {
        Manager manager = new Manager("Mr.Nostrand");
        manager.printBadge();



        Entrepreneur entrepreneur = new Entrepreneur(" Bobby", 4600.00, 400.00);
        System.out.println(entrepreneur);

        SalariedEmployee semployee1 = new SalariedEmployee("John", 100_000.00);
        semployee1.printBadge();


        HourlyEmployee hemployee1 = new HourlyEmployee("Kanye", 22.50, 9.5);
        hemployee1.printBadge();

        IPayable[] persons = {entrepreneur,semployee1, hemployee1, manager};
        Person.printPay(persons);


        Cloth shirt = new Cloth("Supreme shirt", 52.50);
        Cloth pants = new Cloth("Gucci pants", 228.00);
        Cloth suit = new Cloth("Fendi suit", 560.00);

         Cloth.calculateDiscount(shirt, hemployee1);
         Cloth.calculateDiscount(shirt, semployee1);
         Cloth.calculateDiscount(shirt, entrepreneur);
         Cloth.calculateDiscount(shirt, manager);
        System.out.println("\n");

         Cloth.calculateDiscount(suit, persons);










    }
}
