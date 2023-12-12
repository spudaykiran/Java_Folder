package Exception_Handling;
class Myexception extends Exception{

}
public class throwException {
    static int age = 30;
    public static void main(String[] args){
        try{
            if(age<=18)
                throw new Exception("Not eligible to vote");
            else
                System.out.println("you are Eligible to vote");
        }
        catch(Exception e){
            System.out.println("Exception caught");
            System.out.println(e.getMessage());
        }
    }
}
