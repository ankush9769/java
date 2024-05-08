
class mythr2 extends Thread{
    public void run(){
        int a =0;
        while(a <= 50000){
            System.out.println("thank you");
            a++;
        }
    }
}

class mythr3 extends Thread{
    public void run(){
        while(true){
            System.out.println("thanks you dear");
        }
    }
}

public class J47threadsmethods {
    public static void main(String[] args) {
        mythr2 T1 = new mythr2();
        mythr3 T2 = new mythr3();
        T1.start();
        try{
            T1.join();     // join() method says first complete T1 then start T2
        }
        catch (Exception e){
            System.out.println(e);
        }
        T2.start();




    }
}
