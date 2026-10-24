//The Process of combining data and methods in s single unit as a class is Encapsulation.
//Data Encapsulation Example

class Student{
    private String name;
    private int age;
    //setter method for name
    public void setname(String name){
        this.name =name;
    }
    public void setage(int age){
        this.age =age;
    }
    //getter method for name
    public String getname(){
        return name;
    }
    //getter method for age
    public int getage(){
        return age;
    }
}
public class EncapsulationExample{
    public static void main(String[]args){
        Student s1 = new Student();
        s1.setname("Prashant");
        s1.setage(20);
        System.out.println("Name: " + s1.getname());
        System.out.println("Age: " + s1.getage());
    }
}
