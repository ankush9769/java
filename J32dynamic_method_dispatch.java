class phone{
    public void geet(){
        System.out.println("hello , i am phone like Nokia 1033");
    }
    public void switchon(){           //you can not access this function by using the dynamic_method_dispatch
        System.out.println("turn on the phone");
    }
}



class smartphone extends phone{
    public void namaste(){       //you can not access this function by using the dynamic_method_dispatch
        System.out.println("Namaste , i am smartphone like realme");
    }
    public void switchon(){
        System.out.println("turn on the smartphone");
    }
}



public class J32dynamic_method_dispatch {
    public static void main(String[] args) {
        phone obj = new smartphone();        //this  is known as dynamic_method_dispatch
        obj.geet();
        obj.switchon();
    }
}
