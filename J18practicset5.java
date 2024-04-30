import java.util.Scanner;

public class J18practicset5 {
    public static void main(String[] args) {
        //Q1)display the trigle pattern
        int i,j;
        for(i=6;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }


        //Q2)write the program for sum of first n even no
        Scanner cs =new Scanner(System.in);
        int no=1;
        System.out.println("enter the value of n");
        int num = cs.nextInt();
        int i=1;
        int sum=0;
        while(no != num)
        {
            System.out.println(2*no);
            sum=sum+(2*no);
            no++;
        }
        System.out.println("sum ="+sum);



        //Q3)find the factorial of n no.
        int num = 5;
        int fact =1;
        int i;
        for(i=num;i>=1;i--)
        {
            fact = fact * i;
        }
        System.out.println("the factorial ="+fact);



        //Q4)display the sum of no. which occur in the table of 8
        int i=8;
        int sum =0;
        while (i<=80)
        {
            sum =sum + i;
            i = i + 8 ;

        }
        System.out.println("the of no which is occur in table of 8 ="+sum);


    }
}
