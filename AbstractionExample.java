//The Process of hiding the implementation details and showing only functionality to the
// user is Abstraction.

//Data Abstraction Example 

abstract class Vehicle{
    abstract void start();
    public void stop(){
        System.out.println("Vehicle Stopped");

    }
}
class Car extends Vehicle{
    @Override 
    void start() {
        System.out.println("Car Started");

    }
}
public class AbstractionExample{
    public static void main(String[]args){
        Car c = new Car();
        c.start();
        c.stop();
    }
}