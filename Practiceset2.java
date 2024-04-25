public class Practiceset2 {
    public static void main(String[] args) {


        //question 1
        float result = 7/4.0f *9/2.0f;
        System.out.println(result);

        //question 2: incrypt the grade by adding 8 in grade and decrypt the original grade
        //incrypted form
        char grade = 'A';
        grade = (char)(grade + 8);
        System.out.println(grade);
        //decrypted form
        grade = (char)(grade - 8);
        System.out.println(grade);
        

    }
}
