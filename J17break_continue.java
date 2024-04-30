public class J17break_continue {
    public static void main(String[] args) {
        //it will break the loop when 6 is occur in the loop
        int i;
        for(i=0;i<=10;i++)
        {
            if(i==6)
            {
                System.out.println("break statement is occur");
                break;
            }
            else
            {
                System.out.println(i);
            }

        }


        //continue will skip that perticular itaration and execute the next itaration
        int b;
        for(b=0;b<=10;b++)
        {
            if(b==6)
            {
                System.out.println("the continue statement is occor");
                continue;
            }
            else
            {
                System.out.println(b);
            }
        }
    }
}
