//here we learning the inharitence concept
//creating the base class
class base{
    int x;
    public void printme(){
        System.out.println("this is printme method from the base class");
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}
//now lets suppose we want to create one more class with some new feature and also having the base class featurs
class derived extends base{         //derive 1 class from old class we use the extend  name_of_class
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}


public class J29inharitence {
    public static void main(String[] args) {
        //from base class
        base b = new base();
        b.setX(100);
        System.out.println(b.getX());
        b.printme();


        //from derived class
        derived b = new derived();
        b.setX(100);
        System.out.println(b.getX());
        b.setY(200);
        System.out.println(b.getY());




    }
}
