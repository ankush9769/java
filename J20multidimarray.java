import java.util.Scanner;

public class J20multidimarray {
    public static void main(String[] args) {
        //multidimentional array
        int [][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matrix[1][0]);



        //take the matrix value from user
        int [][] flat = new int[3][3];
        int i,j;
        System.out.println("enter the value of matrix");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                Scanner sc = new Scanner(System.in);
                flat[i][j] = sc.nextInt();
            }
        }
        System.out.println("now printing the value of matrix");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(flat[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
