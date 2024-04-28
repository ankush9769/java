import java.util.Scanner;

public class J3Userinput {
    public static void main(String[] args) {


        //taking input from user
        System.out.println("taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no");
        float a = sc.nextFloat();
        System.out.println("enter second no");
        int b = sc.nextInt();
        System.out.println("your first no = "+a);
        System.out.println("your second no = "+b);
        float sum = a + b;
        System.out.println("the sum of two nomber is = "+sum);


        //if you want take the input as a string then use only sc.next()
        System.out.println("inter the string");
        String str = sc.next();
        System.out.println(str);


        //if you want take the input as a stringline then use  sc.nextline()
        System.out.println("inter the string");
        String strs = sc.nextLine();
        System.out.println(strs);



        //check whether userinput is integer or not
        Scanner take = new Scanner(System.in);
        System.out.println("enter num for checking ");
        boolean b1 = take.hasNextInt();           //sc.hasNextInt() is used for checking the no for integer or not
        System.out.println(b1);
        if (b1 == true)
        {
            System.out.println("the given no is int");
        }
        else
        {
            System.out.println("the given no is not int");
        }
    }
}
