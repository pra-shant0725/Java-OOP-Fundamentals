//The polymorphism is the ability of an object to take on many forms. 
// The most common use of polymorphism in OOP is when a parent class reference is 
// used to refer to a child class object.

//Polymorphism example

class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override 
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    @Override 
    void sound(){
        System.out.println("Cat meows");
    }
}
public class PolymorphismExample{
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound(); // Output: Dog barks
        a2.sound(); // Output: Cat meows
    }
}