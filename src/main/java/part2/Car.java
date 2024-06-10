package part2;

public class Car {
    //Fields
    /* Instance fields are variables:
        belong to an instance of the class.
        Each instance has its own copy of instance variables
        Accessed using an object of the class.
     */
    String id;
    String brand;
    int year;
    //More fields as needed

static int counter = 0;

    //Methods
    public String getCarInfo(){
        System.out.println(counter); // we can access the static fields and methods inside the instance
        return "ID:" + id + " , Brand: " + brand + " , Year: " + year;
    }
public static void incrementCounter() {
        //System.out.println(id); we cannot access the instance fields and methods inside the static methods
        counter++;
}
}
