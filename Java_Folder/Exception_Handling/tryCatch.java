/**
  *there are 3 types of errors
  1)Compile time errors --> syntactical errors
  2)Runtime errors --> Exceptions
  3)Logical errors ---> 
 */
package Exception_Handling;
public class tryCatch {
    public static void main(String[] args) {
        // try-catch
        try{
        int result = 10/0;
        System.out.println(result);
        }
        catch(Exception e){
            System.out.println("Exception caught: "+e.getMessage());
        }
        finally{
            System.out.println("This is finally block");
        }

    }
}
