// 1) thread(string name);

class mythr extends Thread{
    public mythr(String name){
        super(name);
    }
    public void run(){
        int a =0;
        while(a <= 50){
            System.out.println("i am thread");
            a++;
        }
    }
}
public class J45constructor_in_threads {
    public static void main(String[] args) {
        mythr th = new mythr("ankush");
        th.start();
        System.out.println("the name ="+th.getName());
        System.out.println("the id ="+th.threadId());
        System.out.println("the priority ="+th.getPriority());

    }
}
