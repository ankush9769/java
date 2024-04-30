import java.util.Scanner;

public class J21practiceset6 {
    public static void main(String[] args) {
        //Q1)create five float array and display the sum of that
        float [] arr ={21.21f,32.23f,43.34f,54.45f,56.65f};
        float sum = 0;
        int i;
        for(i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);



        //Q2)find out the whether the given no is present in array or not
        int [] nu = {1,2,3,4,5};
        System.out.println("enter your no");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        for(i=0;i<nu.length;i++)
        {
            if(num==nu[i]) {
                System.out.printf("yeh this no is match");
                break;
            }
        }



        //Q3)add two matrix 2x3
        int [][] m1={{1,2,3},{4,5,6}};
        int [][] m2={{1,2,3},{4,5,6}};
        int [][] sum={{0,0,0},{0,0,0}};
        int i,j;
        for(i=0;i<2;i++) {
            for (j=0;j<3;j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
                System.out.printf("\t%d",sum[i][j]);
            }
            System.out.printf("\n");
        }




        //Q4)reverse the array
        int [] arr = {1,2,3,4,5};
        System.out.println("before reverse");
        for(int element : arr)
        {
            System.out.printf("\t%d", element);
        }
        System.out.printf("\n");
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int i,temp;
        for(i=0;i<n;i++)
        {
            temp = arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }
        System.out.println("after reverse");
        for(int element : arr)
        {
            System.out.printf("\t%d",element);

        }


        //Q5)find the maximum nu from the array
        int [] arr = {1,2,3,4,5};
        int max = 0;
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("the maximum nu="+max);




        //Q5)find the minimum nu from the array
        int [] arr = {1,2,3,4,5};
        int min = 100;
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println("the minimum nu="+min);

    }
}
