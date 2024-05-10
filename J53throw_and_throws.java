//throws
public class J53throw_and_throws {
    public static void division(int a , int b)throws ArithmeticException { // throws statement said that
        //this is created by developer                                     //this program may have exception so keep
        int result = a/b;                                                // write within the try and catch block
        System.out.println("result"+result);
    }
    public static void main(String[] args) {
        //this function is used by the user
        //    division(21,0);
        //now user write this code under the try and catch block
        try {
            division(22, 0);
        }
        catch (Exception e){
            System.out.println("Exception");
        }
    }
}
