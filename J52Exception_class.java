import java.util.Scanner;

class myexception extends Exception{
    public String toString(){
        return "this is toString()";
    }
    public String getMessage(){
        return "this is getmessage()";
    }
}
public class J52Exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no.");
        a = sc.nextInt();
        if(a<0)
        {
            try{
                throw new myexception();   //throw keyword is used for throw the both custom and inbuild exception
            }
            catch (Exception e){
                System.out.println(e.getMessage());  // it display which error is occur
                System.out.println(e.toString());  // it will display what ever you want
                System.out.println(e);          //it will execute while executing the sout(e)
                e.printStackTrace();
            }
        }

    }
}
