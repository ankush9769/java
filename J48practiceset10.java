//Q1) display the good morning and welcome by using the threads
class mess1 extends Thread{
    public void run(){
        System.out.println("good morning");

    }
}
class mess2 extends Thread{
    public void run(){
        while (true){
        /*    try{                    //this is Q2)) part
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }

         */
            System.out.println("welcome");
        }
    }
}


public class J48practiceset10 {
    public static void main(String[] args) {
        //Q1),Q2)
        mess1 m1 = new mess1();
        mess2 m2 = new mess2();
    //    m1.start();
    //    m2.start();
        //Q3)
        m2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("priority of m2="+m2.getPriority());
        m1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("priority of m1="+m1.getPriority());
        //Q4)
        System.out.println("this is state of m1="+m1.getState());
        System.out.println("this is state of m2="+m2.getState());
        m1.start();
    //    m2.start();



    }
}
