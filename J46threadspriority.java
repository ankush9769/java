// there are three main priority in the threads
// 1) java.lang.Thread.MIN_PRIORITY=1
// 2) java.lang.Thread.NORM_PRIORITY=5
// 3) java.lang.Thread.MAX_PRIORITY=10


class mythr1 extends Thread{
    public mythr1(String name){
        super(name);
    }
    public void run(){
        int a =0;
        while(a <= 50){
            System.out.println("i am thread "+getName());
            a++;
        }
    }
}

public class J46threadspriority {
    public static void main(String[] args) {
        mythr1 t1 = new mythr1("ankushpal");
        mythr1 t2 = new mythr1("ankushvishwarma");
        mythr1 t3 = new mythr1("ankushpol");
        mythr1 t4 = new mythr1("ankush1");
        mythr1 t5 = new mythr1("ankush2");
        //lets suppose i want to set the priority of the threads
        t5.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();








    }
}
