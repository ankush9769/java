import java.util.Scanner;

public class Stringfun {
    public static void main(String[] args) {
        //String name = new String("ankush");
        String name = "ankush";
        System.out.println(name);
        name = "abhishek";
        System.out.println(name);
        System.out.print(name);

        int a = 45;
        float b= 3.454f;
        System.out.printf("\nthe integer value = %d and the float value = %f",a,b);
        // here printf and format are works same or similar
        System.out.format("\nthe integer value = %d and the float value = %f",a,b);

        // how to take string input from user
        Scanner input = new Scanner(System.in);
        String yourname = input.next();
        System.out.println("your name is = "+yourname);

        //if you want to take the multiple line from the user then use nextline()
        String details = input.nextLine();
        System.out.println("this is = "+details);




        // lets talk about the some method of the string

        //length()
        String city = "Mumbai";
        int len = city.length();
        System.out.println(len);

        //toLowerCase()
        System.out.println(city.toLowerCase());

        //toUpperCase()
        System.out.println(city.toUpperCase());

        //trim()
        String nontrim = "   ankush  ";           // it will remove the white space
        System.out.println(nontrim);
        System.out.println(nontrim.trim());

        //substring(end value)
        System.out.println(city.substring(0));
        System.out.println(city.substring(3));

        //substring(start value , end value)
        System.out.println(city.substring(0,5));

        //replace(old , new)
        System.out.println(city.replace('M','L'));
        System.out.println(city.replace("Mum","tut"));
        System.out.println(city.replace("M","ch"));

        //startsWith(value),endsWith(value)
        System.out.println(city.startsWith("Mum"));
        System.out.println(city.endsWith("bai"));

        //charAt(indexing value)
        System.out.println(city.charAt(2));

        //indexOf(char)
        System.out.println(city.indexOf("m"));

        //lastIndexOf(char)
        System.out.println(city.lastIndexOf('u'));

        //equals("string")
        System.out.println(city.equals("Mumbai"));

        //equalsIgnorCase("string")
        System.out.println(city.equalsIgnoreCase("MumBai"));  //does not matter the upper or lower case






    }
}
