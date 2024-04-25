import java.net.SecureCacheResponse;
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    /*    //voting condition
        System.out.println("enter your age");
        int age = sc.nextInt();
        if (age>=18)
        {
            System.out.println("you are adult,you can vote");
        }
        else
        {
            System.out.println("you are not adult,you can not vote");
        }*/



        //army selection
        System.out.println("welcome in army selection camp");
        System.out.println("enter your gender");
        String gender = sc.next();
        System.out.println("enter your age");
        int age = sc.nextInt();
        System.out.println("enter your merial status");
        String merial = sc.next();
        if (gender == "male" || gender == "Male")
        {
            if (age >= 23)
            {
                if (merial == "no" || merial == "No")
                {
                    System.out.println("you are eligible for army");
                }
                else
                {
                    System.out.println("you are not eligible for the army");
                }
            }
            else
            {
                System.out.println("you are not eligible for the army");
            }
        }
        else
        {
            if (age >= 23)
            {
                if (merial == "no" || merial == "No")
                {
                    System.out.println("you are eligible for army");
                }
                else
                {
                    System.out.println("you are not eligible for the army");
                }
            }
            else
            {
                System.out.println("you are not eligible for the army");
            }
        }
    }
}


