

//Q1)create the abstract pen with method writer() and refil() as abstract method and creater a class
//foutainepen with additinonal method changenip()
abstract class pen{
    abstract void write();
    abstract void refil();
}
class fountainpen extends pen{
    public void changenip(){
        System.out.println("you changed the nip");
    }
    public void write(){
        System.out.println("by using you can write");
    }
    public void refil(){
        System.out.println("after finish refil the pen");
    }
}


//Q2)create the class monkey with method jump() and bite() and create one more class human which is inherite
//from the monkey class and implement the basic animal interface with eat() and sleep() method
class monkey{
    public void jump(){
        System.out.println("monkey jumps");
    }
    public void bite(){
        System.out.println("monkey bite also");
    }
}
interface animals{
    void eat();
    void sleep();
}
class human extends monkey implements animals {
    public void eat() {
        System.out.println("eating the food");
    }
    public void sleep() {
        System.out.println("sleeping ");
    }
    public void jump(){
        //super.jump();             Q5)
        System.out.println("monkey jumps and human also jump");
    }
    public void bite(){
        //super.bite();             Q5)
        System.out.println("monkey and some time human bite also ");
    }
}


//Q3) create the class telephone with the ring(),lift() and disconnect() methods  as abstract method
// create another smartphone class and demonstrate the polymorphism
abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class smartphone1 extends telephone{
    public void ring(){
        System.out.println("phone is ringing");
    }
    public void lift(){
        System.out.println("phone lift");
    }
    public void disconnect(){
        System.out.println("phone disconnected");
    }
}


public class J38practiceset8 {
    public static void main(String[] args) {
        //Q1)
        fountainpen f = new fountainpen();
        f.changenip();
        f.write();
        f.refil();

        //Q2)
        human h = new human();
        h.jump();
        h.bite();
        h.eat();
        h.sleep();

        //Q3)
        smartphone1 s= new smartphone1();
        s.ring();
        s.lift();
        s.disconnect();

        //Q5)
        monkey m = new human();
        m.bite();
        m.jump();
        //if you want to display the method of class monkey also then use super()


    }
}
