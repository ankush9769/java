package com.company;
class A{
    public int x=5;
    protected int y=45;
    int z = 6;
    private int a = 78;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);

    }
}
class B extends A{
    public void meth2(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    //    System.out.println(a);
    }
}

public class J40accessmodifiers {
    public static void main(String[] args) {
        A v = new A();
        // all access modifiers can be implemented in the same class
        //v.meth1();
        //all access modifiers can be implemented in the same package except private access modifiers
    /*    System.out.println(v.a);
        System.out.println(v.x);
        System.out.println(v.y);
        System.out.println(v.z);
     */
        //all access modifiers can be implemented in the subclass except private access modifiers
        B b = new B();
        b.meth2();

    }
}
