import java.util.Scanner;

public class J23recursionfun {
    //factorial with recursion
    static int rfact(int x)
    {
        if (x==1 || x==0)
        {
            return 1 ;
        }
        else
        {
            return (x * (rfact(x-1)));
        }
    }

    //fibbonaci series with recursion
    static int rfibo(int x)
    {
        if(x==0 || x==1)
        {
            return x;
        }
        else
        {
            return (rfibo(x-1)+rfibo(x-2));
        }

    }

    //print the sum of first n number with recursion funtion
    static int rsum(int x)
    {
        if (x==0 || x==1)
        {
            return x;
        }
        else
        {
            return (x+rsum(x-1));
        }
    }


    public static void main(String[] args) {
        //we are learing the recursion function
        //recursion fun which called itselt again again is called recursion function

    /*    //factorial by using the recursion funtion
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for the factorial");
        int num = sc.nextInt();
        if (num<0)
        {
            System.out.println("the factorial of negative no does not exit");
        }
        else
        {
            System.out.println("factorial="+rfact(num));
        }



        //fibbonaci series with recursion function
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("how many fibbonaci series you want to print");
        int num = sc.nextInt();
        if (num<=0)
        {
            System.out.println("invalid input");
        }
        else
        {
            System.out.println("fibbonaci series");
            for(i=0;i<num;i++)
            {
                System.out.println(rfibo(i));
            }
        }
     */


        //print the sum of first n number with recursion funtion
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number till you want sum");
        int num = sc.nextInt();
        if (num<=0)
        {
            System.out.println("invalid input");
        }
        else
        {
            System.out.println("the sum of="+rsum(num));
        }

    }
}
