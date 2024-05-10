import java.util.Scanner;

public class J50try_and_catchblock {
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0]=20;
        arr[1]=40;
        arr[2]=60;
        System.out.println("enter the index value so that we can know the value");
        Scanner sc = new Scanner(System.in);
        int indx = sc.nextInt();

        System.out.println("enter the no by which you want to divide");
        int div = sc.nextInt();
        try{
            System.out.println("the value of entered array ="+arr[indx]);
            System.out.println("the division of array/number="+arr[indx]/div);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        }


        catch (Exception e){
            System.out.println("we failed to execute your program because some other exception meets");
            System.out.println(e);
        }
        finally {
            System.out.println("finally we reach to the end of the program");
        }
    }
}
