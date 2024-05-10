import java.security.spec.ECFieldF2m;

/*
    Q) we have to create the calculator which has the exception concept
    1) + addition
    2) - subtraction
    3) * multiplication
    4) / division
    which throws the following exception
    1) invalid input exception eg. 2 $ 3
    2) cannot divide by 0
    3) max input exception , if any of the input is greater than the 100000
    4) max multiplier reached exception - dont allow any multiplication input to be greater than 7000
 */
class invalidinputexception extends Exception{
    @Override
    public String toString() {
        return "the input is invalid";
    }
}
class cantdividebyzero extends Exception{
    @Override
    public String toString() {
        return "this can not be divide by zero";
    }
}
class maxinputexception extends Exception{
    @Override
    public String toString() {
        return "your input is greater than 100000";
    }
}
class  maxmultiplier extends Exception{
    @Override
    public String toString() {
        return "your multiplication input should not be greater than the 7000";
    }
}
public class J54calculator_byException {
    public static void addition(int a ,int b)throws invalidinputexception{
        int c = a + b;
        System.out.println("addition="+c);
    }
    public static void subtraction(int a ,int b)throws invalidinputexception{
        int c = a - b;
        System.out.println("substraction="+c);
    }
    public static void multiplication(int a ,int b)throws maxmultiplier{
        if (a>7000 || b>7000){
            throw new maxmultiplier();
        }
        int c = a * b;
        System.out.println("multiplication="+c);
    }
    public static void division(int a ,int b)throws cantdividebyzero{
        if (b==0){
            throw new cantdividebyzero();
        }
        int c = a / b;
        System.out.println("division="+c);
    }
    public static void main(String[] args) {
        System.out.println("calculator");
        try{
            addition(12,23);
            subtraction(90,100);
            multiplication(70000,2);
            division(46,0);
        }
        catch (Exception e){
            System.out.println(e);
        }



    }
}
