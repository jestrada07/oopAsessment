package workforce;

public class Cloth {
    private String description;
    private double price;



    public Cloth(String description, double price){
        this.description = description;
        this.price = price;




    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public static void calculateDiscount
            (Cloth cloth , IPayable person){
        person.printItemDiscount(cloth.getPrice());


    }


    public static void calculateDiscount(Cloth cloth, IPayable[] persons){
            for(IPayable person : persons){

                person.printItemDiscount(cloth.getPrice());



            }



    }




}
