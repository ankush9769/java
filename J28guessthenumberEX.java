/* problem statement
          create a class that allows the users to play the "guess the number" game once,
          game should have following methods
          1) constructor to generate the random no.
          2) takeuserinput() to take the input from the user
          3) iscorrecr() to check whether the no. which is given by user is true or not
          4) getter and setter for noofguess
          use the property such as noofguess(int)
*/


import java.util.Random;
import java.util.Scanner;

class game{
    public int noofguess = 0;
    public int rnum;
    public int usernum;

    public game(){
        Random random = new Random();
        rnum = random.nextInt(1,100);
    }
    public void takeuserinput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no for guess");
        usernum = sc.nextInt();
    }
    public void iscorrect(){
        while(usernum !=rnum)
        {
            takeuserinput();
            if(usernum>rnum)
            {
                System.out.println("your no is to large");
            }
            else if(usernum<rnum)
            {
                System.out.println("your no is to small");
            }
            if(usernum==rnum)
            {
                System.out.println("you have choose the currect no");
            }
            noofguess++;
        }
    }
}

public class J28guessthenumberEX {
    public static void main(String[] args) {
        game start = new game();
        start.iscorrect();
        System.out.printf("you choosen the number within %d try ",start.noofguess);

    }
}
