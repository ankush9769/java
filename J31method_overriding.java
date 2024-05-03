//overriding = two method having the same name but different function with different class
class A{
    int x=100;
    public void meth1(){
        System.out.println("i am method 1 of class A");
    }
}

class B extends A{
    public void meth2() {
        System.out.println("i am method 2 of class B");
    }
    //lets create the method overriding
    public void meth1(){
        super.meth1();          //in this way you can access the method which is present in the parent class
        int x1 = super.x;       //in this way you can access property which is in present in the parent class
        System.out.println(x1);
        System.out.println("i am overriding method 1 of class B");
    }
}
public class J31method_overriding {
    public static void main(String[] args) {
        B b = new B();
        b.meth1();   //this is method overriding

    }
}
