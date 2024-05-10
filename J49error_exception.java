//there are three type of error
//1)syntax error
//2)logical error
//3)runtime error

import java.util.Scanner;

public class J49error_exception {
    public static void main(String[] args) {
        //syntax error
    //    int a = 12       // semicolon missing
        //    b= 23;           // b is not declared

        //logical error
        //writing the program for the prime no.
        int i;
        for(i=2;i<5;i++){
            System.out.println(i*2+1);      //this will print 9 also which is logical error
        }


        //runtime error or exception
        int j = 1000;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(j/k);    //if i will the value of the k =0 then it throws an error
    }
}
