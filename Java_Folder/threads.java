// class p1 implements Runnable{//extends Thread
//     public void run(){
//         for(int i=0;i<10;i++){
//             System.out.println("Hello World");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }    
//     }
// }
// class p2 implements Runnable//extends Thread
// {
//     public void run(){
//         for(int i=0;i<10;i++){
//             System.out.println("HI");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }    
//     }
// }
// class threads{
//     public static void main(String[] args) {
//         p1 obj1 = new p1();
//         p2 obj2 = new p2();
//         // System.out.println(obj1.getPriority());
//         // System.out.println(obj1.getName());
//         // obj1.setPriority(3);
//         // System.out.println(obj1.getPriority());
//         Thread t1 = new Thread(obj1);
//         Thread t2 = new Thread(obj2);
//         t1.start();
//         t2.start();
//     }
// }

public class threads {
    public static void main(String[] args) {
        Runnable p1=()->
        {
            for(int i=0;i<5;i++){
                System.out.println("HI");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable p2 = ()->
        {
            for(int i=0;i<5;i++){
                System.out.println("Bye");
                try{
                    Thread.sleep(10);
                }
                catch(Exception e){
                    System.out.println("Caught Exception in thread 2"+e.getMessage());
                }
            }
        };

        Thread t1=new Thread(p1);
        Thread t2=new Thread(p2);
        t1.start();
        t2.start();

    }
    
}