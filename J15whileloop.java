import java.util.Scanner;

public class J15whileloop {
    public static void main(String[] args) {
        //keep adding the nomber which is given by user till user enter the 0
        int sum = 0;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        num = sc.nextInt();
        sum = sum + num;
        while(num != 0)
        {
            System.out.println("enter the number");
            num = sc.nextInt();
            sum = sum + num;
        }
        System.out.println("the sum ="+sum);
        
    }
}
