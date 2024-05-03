class base1{
    int x;
    public base1(){
        System.out.println("i am constructor of both class,base1 and derived1");
    }
    //lets create the overloaded constructor
    public base1(int x){
        System.out.println("i am a overloaded constructor"+x);
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}

class derived1 extends base1{
    int y;

    public derived1(){
        //if we want to execute the argument wala constructor from the base1 class then we use the super(int x)
        super(0);
        System.out.println("i am constructor of derived1 class");
    }
    //now create the overloaded constructor in the derived1 class also
    public derived1(int x, int y){
        super(x);
        System.out.println("i am overloaded constructor of derived1 class");
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}

class child extends derived1{
    public child(){
        System.out.println("i am constructor of child class");
    }
    public child(int x,int y,int z){
        super(x,y);
        System.out.println("i am overloaded constructor of child class"+z);
    }
}
public class J30constructor_in_inheritence {
    public static void main(String[] args) {
        //first we run the base1 class constructor
        base1 b = new base1();

        //then we run the derived1 class constructor
    //    derived1 d = new derived1();            //it will also invoke the constuctor of base1 class

        //after adding the super(int x) in the derived1 class it will invoke the argument wala constructor

        //now create the overloaded constructor in the derived1 class also
        derived1 d = new derived1(23,21);

        //if i will use the super(int x)in the derived1 constructor then it will run the intx wala constructor in base1 class

        //now i created one more class whos name child which derived form derived1
        child c = new child(12,23,34);




    }
}
