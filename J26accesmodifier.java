//here we are learning the access modifier
//1)private
//2)default
//3)protected
//4)public

class empl
{
    private  int id;      //here we use the private access modifier so that no can change easily
    private String  name;
    public String getname()           //were getter means getname
    {
        return name;
    }
    public void setname(String na)        //were setter means setname
    {
        name = na;
    }
    public int getid()
    {
        return id;
    }
    public void setid(int no)
    {
        id = no;
    }
}


public class J26accesmodifier {
    public static void main(String[] args) {
        empl detail = new empl();
    /*  detail.name;              //here we can not access these object becouse of private access modifier
        detail.id;  */
        detail.setname("raj");
        System.out.println(detail.getname());
        detail.setid(1890);
        System.out.println(detail.getid());


    }
}
