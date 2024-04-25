public class Practiceset3 {
    public static void main(String[] args) {

        //convert into string into lowercase
        String name = "ANKUSH";
        System.out.println(name.toLowerCase());

        //replace the space by underscore
        String text ="hello my name is ankush";
        System.out.println(text.replace(" ","_"));

        //replace the name by your name
        String intro ="hey , is name good guy?";
        System.out.println(intro.replace("name","ankush"));

        //find the double and triple space in the string
        String info = "this string contains  double and   triple space";
        System.out.println(info.indexOf("  "));
        System.out.println(info.indexOf("   "));

        //write the same string by using the escape sequence
        String str = " \"this is string contains escape sequence\" ";
        System.out.println(str);
    }
}
