import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first latter of day of week");
        String c = sc.next();
        switch(c) {
            case "s":
                System.out.println("sunday");
                break;
            case "m":
                System.out.println("monday");
                break;
            case "t":
                System.out.println("tuesday");
                break;
            case "w":
                System.out.println("wednesday");
                break;
            case "th":
                System.out.println("thusday");
                break;
            case "f":
                System.out.println("frisday");
                break;
            case "sat":
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid input");
        }


    }
}
