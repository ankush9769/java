//employee
class employee{
    String name;
    int salary;
    public int getsalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public String setName()
    {
        name="abhishek";
        return name;
    }
}
//cellphone
class cellphone
{
    public void messages()
    {
        System.out.println("\"vibrating\"");
        System.out.println("\"ringing\"");
    }
}

public class J25practiceset7 {
    public static void main(String[] args) {
        //Q1)employee to display the name , salary,and also by some function or methods
        employee detail = new employee();
        detail.name="ankush";
        detail.salary=100000;
        System.out.println(detail.getsalary());
        System.out.println(detail.getName());
        System.out.println(detail.setName());



        //Q2)make class cellphone and display the vibrating and ringing by function on methods
        cellphone mess = new cellphone();
        mess.messages();

    }
}
