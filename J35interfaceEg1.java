                                    /*    1rst example of interface    */
                         /* this is also eg of multiple inheritence bu using the interface*/


 /*
  # interface is similar to the abstract but not same
  # we can not create the object of the interface
  # for inheriting the class from interface we use implements instead of extends
  # interface does not contain the non abstract method
  # we can create the new class by using the multiple interface class
  */
class bike{
    public void function(){
        System.out.println("bike having the 2 wheels , 1 head light and engeine");
    }
 }
interface featurs{                 //iterface is basically requirement of user
    int a = 45;
    void breaks();
    void speedup();
}

//we can inherit the new class from multiple interface class
interface horn{
    int b = 50;
    void horn1();
    void horn2();
}
class splender extends bike implements featurs,horn{             //in interface new class is also extends from same class
    public void breaks(){
        System.out.println("speed down the bicycle");
    }
    public void speedup(){
        System.out.println("speed up the bicycle");
    }

    // emplimenting the multiple interface method
    public void horn1(){
        System.out.println("poo poo poo");
    }
    public void horn2(){
        System.out.println("pee pee pee");
    }
}
public class J35interfaceEg1 {
    public static void main(String[] args) {
        splender bike = new splender();
        bike.function();
        bike.breaks();
        bike.speedup();
        System.out.println(bike.a);

        //we can not change the properties of interface
    /*    bike.a=50;          //because it is final
        System.out.println(bike.a);
    */

        //we can inherit the new class from multiple interface class
        bike.horn1();
        bike.horn2();
    }
}




