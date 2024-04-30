public class J19array {
    public static void main(String[] args) {
        //array declaration
        //array can be declared in three ways
        /*1) int [] marks;
             new int[5];
          2) int [] marks = new int[5];
          3) int [] marks = {12,13,14,15,16};

         */

        int [] marks = new int[5];
        marks[0]=101;
        marks[1]=102;
        marks[2]=103;
        marks[3]=104;
        marks[4]=105;
        System.out.println(marks[4]);


        //how to display the array
        int [] nu = {11,12,13,14,15};
        int i;
        for(i=0;i<5;i++)
        {
            System.out.println(nu[i]);
        }


        //some imp consept or function of array
        String [] name = {"hariom","parth","bishal","abhishek"};
        System.out.println(name.length);




        //for each loop in java
        int [] marks1 = {12,13,14,15,16};
        for(int element : marks1)
        {
            System.out.println(element);
        }
    }
}
