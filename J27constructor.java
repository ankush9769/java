class empl1
{
    private  int id;
    private String  name;
    private int salary;

/*    public empl1(){                     //this is a constructor which can be automaticaly occur when nothing is given
        id=1811;
        name="ankush";
    }

 */

    //constructor with argument
    public empl1(String x,int y){
        id=y;
        name=x;
    }

    //constructor overloading=constructor overloading means there can be multiple method with same name withing the clss but different parameter or arguments
    public empl1(String x,int y,int z){
        id=y;
        name=x;
        salary=z;
    }
    public String getname() {
        return name;
    }
    public void setname(String na) {
        name = na;
    }
    public int getid() {
        return id;
    }
    public void setid(int no) {
        id = no;
    }


    public int getSalary() {
        return salary;
    }
}

public class J27constructor {
    public static void main(String[] args) {
        empl1 detail = new empl1();     //here empl1() is a constructor and we can create the same empl1() in the class
        detail.setname("abhishek");             //we can also pass argument to empl1() constructor
        System.out.println(detail.getname());
        detail.setid(1911);
        System.out.println(detail.getid());
        //if above set and get will not menstion the it will automatacly run the constructor
        System.out.println(detail.getid());
        System.out.println(detail.getname());




        //instead of doing all these things we also pass the argument to constructor empl1()
        empl1 detail = new empl1("ankush",1811);
        System.out.println(detail.getid());
        System.out.println(detail.getname());




        //constructor overloading
        //constructor overloading means there can be multiple method with same name withing the clss but different parameter or arguments
        empl1 detail = new empl1("ankush",1811,100000);
        System.out.println(detail.getid());
        System.out.println(detail.getname());
        System.out.println(detail.getSalary());
    }
}
