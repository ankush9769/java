// here we are learning the multithreading with runnable interface


class mythreadrunnable1 implements Runnable{
    public void run(){
        while (true){
            System.out.println("this is runnable thread1 ");
        }
    }
}

class mythreadrunnable2 implements Runnable{
    public void run() {
        while (true) {
            System.out.println("this is runnable thread2 ");
        }
    }
}

public class J44multithreading_with_runnableinterface {
    public static void main(String[] args) {
        mythreadrunnable1 r1 = new mythreadrunnable1();
        Thread thread1 = new Thread(r1);

        mythreadrunnable2 r2 = new mythreadrunnable2();
        Thread thread2 = new Thread(r2);

        thread1.start();
        thread2.start();

    }
}
/*
    # lets talk about the thread life cycle
    there are five stage in the thread life cycle
    1) new = in threads the only object is created but start() method not yet run
    2) runnable = now it is ready to take to get the cpu time
    3) running = now the threads are the running
    4) non runnable = if threads request any input output then it goes to the non runnable stage
    5) terminated = if threads working is completed then it comes to the terminate stage

    you can relate this all stages with the operating system process
 */