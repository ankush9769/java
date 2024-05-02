public class J22function {
    //funtion with returning the value and with argument
    static int sum(int a , int b){
        int result;
        result = a+b;
        return result;
    }
    //funtion without returning the value and without argument
    static void sum3(){
        int a =10;
        int b=20;
        int result;
        result = a+b;
        System.out.println(result);

    }

    //function without returning value and with agrument
    static void sum2(int a , int b){
        int result;
        result = a+b;
        System.out.println(result);;
    }
    //funtion with returning the value and without argument
    static int sum4(){
        int a =10;
        int b=20;
        int result;
        result = a+b;
        return result;
    }


    static void change(int [] arr1)
    {
        arr1[0]=100;
    }

    //from here we are learning the method overloding
    static void foo()
    {
        System.out.println("hello welcome");
    }

    static void foo(String name)
    {
        System.out.println("hello welcome "+name);
    }


    public static void main(String[] args) {
    /*    int x =10;
        int y =20;
        int c;
        c=sum(x,y);
        System.out.println(c);
        sum2(x,y);
        sum3();
        c=sum4();
        System.out.println(c);

     */


        //function with the array
        int [] arr ={11,12,13,14,15};
        change(arr);
        System.out.println("now after change the value="+arr[0]);


        //method overloding
        String name = "ankush";
        foo();
        foo(name);


    }




}
