/*       interface example two      */


// iterface it just basically user requirment
/* let suppose there is one client whos requirement is to create the software in which ,we can input and
   get the output .
   then user create the software according to client requirment
 */

                           import java.util.Scanner;
                           interface client{
    public void input();
    public void output();
}
class devloper implements client{
    String name;
    int salary;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter your name ");
        name = sc.nextLine();
        System.out.println("enter your salary ");
        salary=sc.nextInt();
    }
    public void output(){
        System.out.printf("your name ans salary =%s,%d",name,salary);
    }
}
public class J35interfaceEg2 {
    public static void main(String[] args) {
        client sw = new devloper();
        sw.input();
        sw.output();

    }
}
