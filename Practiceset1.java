import java.util.Scanner;

public class Practiceset1 {
    public static void main(String[] args) {
        //calculate the CGPA of the student
        float sub1 = 68;
        float sub2 = 89;
        float sub3 = 50;
        float cgpa = (sub1+sub2+sub3)/30;
        System.out.println("CGPA is = "+cgpa);


        //take the name from the user and print some griting line
        System.out.println("enter your name ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("hello "+name+" welcome to our home");
    }
}
