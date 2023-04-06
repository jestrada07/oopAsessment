package workforce;

public class Person {
    private String name;

    public Person(String name){
        this.name = name;




    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }








    public static void printPay(IPayable[] persons) {

        for( IPayable person : persons) {

            person.printCalculatedPay();


        }





    }
}
