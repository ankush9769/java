import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissorsEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("1 = rock ,2 = paper ,3 = scissor");
        System.out.println("enter your choice");
        int x = sc.nextInt();
        int num = random.nextInt(1,3);
        if(num==1)
        {
            System.out.println("computer has choosen the rock");
        }
        else if(num==2)
        {
            System.out.println("computer has choosen the paper");
        }
        else
        {
            System.out.println("computer has choosen the scissor");
        }
        //user
        if(x==1 && num==2)
        {
            System.out.println("you loose the game");
        }
        else if(x==1 && num==3)
        {
            System.out.println("you won the game");
        }
        else if(x==2 && num==1)
        {
            System.out.println("you won the game");
        }
        else if(x==2 && num==3)
        {
            System.out.println("you loose the game");
        }
        else if(x==3 && num==1)
        {
            System.out.println("you loose the game");
        }
        else if(x==3 && num==2)
        {
            System.out.println("you won the game");
        }
        else
        {
            System.out.println("invalid input");
        }
    }
}
