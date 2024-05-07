/* one interface inherite from another interface */
interface parentinterface{
    void meth1();
    void meth2();
}
interface childinterface extends parentinterface{    //this interface is inherite from parentinterface
    void meth3();
    void meth4();
}
class methods implements childinterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}

public class J36inheritence_in_interface {
    public static void main(String[] args) {
        methods m = new methods();
        m.meth1();
        m.meth2();
        m.meth3();
        m.meth4();

    }
}
