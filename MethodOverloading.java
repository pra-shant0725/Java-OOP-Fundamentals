//The process of defining multiple methods with the same name but different parameters 
// is called Method Overloading.

// Method Overloading Example

class Calculate{
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
public class MethodOverloading{
    public static void main(String[]args){
        Calculate c = new Calculate();
        System.out.println("Sum of 2 numbers: " + c.sum(10,20));
        System.out.println("Sum of 3 numbers: " + c.sum(10,20,30));
    }
}