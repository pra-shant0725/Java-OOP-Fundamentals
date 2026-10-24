// The process of creating a new class from an existing class is called Inheritance. 
// It is a mechanism in which one class acquires the property of another class. 
// In Java, inheritance is achieved using the "extends" keyword.

//Inheritance example

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}