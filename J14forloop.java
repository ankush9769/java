public class J14forloop {
    public static void main(String[] args) {
        //print the 1 to 10 digit by using the for loop in java
        int i;
        for(i=1;i<=10;i++)
        {
            System.out.println(i);
        }


        //print the table of 2
        int j;
        int k=1;
        for(j=2;j<=20;j=j+2)
        {
            System.out.printf("\n2 x %d = %d",k,j);
            k++;
        }
    }
}
