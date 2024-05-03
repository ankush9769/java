//here we are creating the own class
class info{                                       //keep in mind in program there should be only one class with public
    int id;
    String name;
    char div;
    int salary;
    public void fun(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(div);
    }
    public int getSalary(){
        return salary;
    }

}



public class J24class {
    public static void main(String[] args) {
        //now we useing the class
        info ankush = new info();        //here we creat the object of class ,named as ankush
        ankush.id=1811;
        ankush.name="ankushpal";
        ankush.div='A';
        System.out.println(ankush.id);
        System.out.println(ankush.name);
        System.out.println(ankush.div);
        //let add one student details ,,, for that creat one more object of class ,named as abhishek
        info abhishek = new info();
        abhishek.id=1911;
        abhishek.name="abhishek_gupta";
        abhishek.div='B';
        System.out.println(abhishek.id);
        System.out.println(abhishek.name);
        System.out.println(abhishek.div);

        //same above print statement can also print by creating the method/function in the class
        ankush.fun();
        abhishek.fun();

        //now salary
        //1) salary by normally
        ankush.salary=12000;
        System.out.println(ankush.salary);
        //2) salary by using function in class
        int pagar = ankush.getSalary();
        System.out.println(pagar);






         }
}
