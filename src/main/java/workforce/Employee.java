package workforce;

public abstract class Employee extends Person implements IPayable {
  private int id;


  private static int identificationID = 0;






    public Employee(String name){
        super(name);
        this.id = ++identificationID;



    }

    public int getId() {
        return id;
    }


    public abstract void printBadge();





}
