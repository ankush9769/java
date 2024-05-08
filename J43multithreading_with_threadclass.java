// here we are learning the multithreading with thread class

class mythread1 extends Thread{   //to use the multithreading in java we use the Thread class
    public void run(){            //this run() method is also used in the Threading
        while(true) {
            System.out.println("this is the cooking thread1");
            System.out.println("i am happy");
        }
    }
}

class mythread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("this is the chating thread2");
            System.out.println("i am not interested");
        }
    }
}

public class J43multithreading_with_threadclass {
    public static void main(String[] args) {
        mythread1 t1 = new mythread1();
        mythread2 t2 = new mythread2();
        t1.start();                 // start() is used for runing the method of run() in the above classes
        t2.start();
        //in this output cpu sometime run the mythread1 and sometime run the mythread2 , means multitasking

    }
}
