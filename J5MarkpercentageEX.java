import java.util.Scanner;

public class J5MarkpercentageEX {
    public static void main(String[] args) {
        // calculate the percentage of the marks of student
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the subject1 marks");
        float m1 = sc.nextInt();
        System.out.println("enter the subject2 marks");
        float m2 = sc.nextInt();
        System.out.println("enter the subject3 marks");
        float m3 = sc.nextInt();
        System.out.println("enter the subject4 marks");
        float m4 = sc.nextInt();
        float sum = m1+m2+m3+m4;
        System.out.println(sum);
        float percent = sum*100 / 400;
        System.out.println("the percentage of the student = "+percent);

    }
}
