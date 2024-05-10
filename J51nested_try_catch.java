import java.util.Scanner;

public class J51nested_try_catch {
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0]=20;
        arr[1]=40;
        arr[2]=60;
        System.out.println("enter the index value so that we can know the value");
        Scanner sc = new Scanner(System.in);
        int indx = sc.nextInt();
        try{
            System.out.println("welcome to out java course");
            try {
                System.out.println(arr[indx]);
            }
            catch(Exception e){
                System.out.println("the exception found in level2");
                System.out.println(e);
            }
        }
        catch (Exception e){
            System.out.println("the exception found in level1");
            System.out.println(e);
        }
    }
}
