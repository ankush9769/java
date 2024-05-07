/* now we studying about the abstract class
   # abstract class contents abstract method and non abstract method both
   # if any class contains the abstract method then that class will be abstract class
   # and we can also create the abstract class without abstract method
   # we can not create the object of abstract class,but we can create the refernce of the abstract class
   # abstract class is used when we dont want to mention the content of the abstract method
   # we can also run the constructor of the abstract class , by create the constructor of the other class
     which is inherit from the abstract class by using the super() method
   # we can not create new class from the multiple abstract class
   eg,let suppose there are two animal class dog and lion and they both eat but the way of eating is
      different so this common method can be written in the abstract class and these dog and lion
      both class should be inherite from the abstract class
 */

abstract class animal{
    public animal(){
        System.out.println("this is constructor of the abstract class");
    }

    public abstract void sound();
    public abstract void eat();
}
class dog extends animal{
    public dog(){
        super();
        System.out.println("this is constructor of the dog class");//this is use for the run the constructor of the abstract class
    }
    public void sound(){
        System.out.println("dog barks");
    }
    public void eat(){
        System.out.println("dogs are veg and nonveg both");
    }
}
class lion extends animal{
    public void sound(){
        System.out.println("lion roar");
    }
    public void eat(){
        System.out.println("lions are nonveg ");
    }
}

public class J34abstract {
    public static void main(String[] args) {
        dog d = new dog();
        lion l = new lion();
        d.sound();
        d.eat();
        l.sound();
        l.eat();


        //we can also do the same thing but in different way
        animal a = new dog();
        a.sound();
        a.eat();
        animal b = new lion();
        b.sound();
        b.eat();
    }
}
