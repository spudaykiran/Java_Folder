package interfaces;
/**
 * Types of interfaces --
 * ->Normal interface -- multiple methods
 * ->Functional interface -- Single abstract method
 * ->Marker interface  -- no methods will be there in this interface it is used for future
 */
@FunctionalInterface
interface A {
    void show();
}
@FunctionalInterface
interface B {
    int add(int i,int j);
}
public class functionalinterface {
    public static void main(String[] args) {
        A obj = new A() 
        {
            public void show()
            {
                System.out.println("Hello");
            }
        };
        obj.show();

        // method using after java 8
        A obj1 = ()->{
            System.out.println("Hello");
        };

        obj1.show();

        //returning values using lambda expression

        B obj2 = (int i,int j) -> i+j;;
        System.out.println(obj2.add(5,6));
    }
}
