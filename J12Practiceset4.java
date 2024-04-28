import java.util.Scanner;

public class J12Practiceset4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //print the you are fail or pass according there marks
        System.out.println("enter the sub1 marks");
        int m1 = sc.nextInt();
        System.out.println("enter the sub2 marks");
        int m2 = sc.nextInt();
        System.out.println("enter the sub3 marks");
        int m3 = sc.nextInt();
        System.out.println("enter the sub4 marks");
        int m4 = sc.nextInt();
        float avg = (m1+m2+m3+m4)/4.0f;
        System.out.println("overall percentage is ="+avg);
        if  ((avg >= 40)&&((m1>=33) && (m2>=33) && (m3>=33) && (m4>=33)))
        {
            System.out.println("you are pass in all subject");
        }
        else
        {
            System.out.println("you are fail ");
        }


        //income tax should be paid
        System.out.println("enter your income");
        float tax = sc.nextFloat();
        if (tax < 2.5)
        {
            System.out.println("you dont have to pay the tax");
        }
        else if ((tax >= 2.5)&&(tax <=5.0))
        {
            System.out.println("you have to pay 5% tax");
        }
        else if ((tax >= 5.0)&&(tax <=10.0))
        {
            System.out.println("you have to pay 20% tax");
        }
        else
        {
            System.out.println("you have to pay 30% tax");
        }


        //display the name of day of week according to number
        System.out.println("enter the first latter of day of week");
        int n = sc.nextInt();
        switch(n) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thusday");
                break;
            case 6:
                System.out.println("frisday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid input");
        }

    }
}
