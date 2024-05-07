import java.util.Scanner;

/*problem statement
 # you have to implement the library using the class in java
 # methods : addbook(),issuebook(),returnbook(),showAvailableBook()
 # propertries : Array to store the available books, Array to store the essued book
*/
class library{
    String [] books = new String[6];
    String [] essuedbook = new String[10];

    public void issuedbook(){
        System.out.println("which book you want to essue");
        System.out.println("comedy,drama,romance,success,power");
        Scanner sc = new Scanner(System.in);
        String userbook = sc.next();
        int i;
        for(i=0;i<=4;i++){
            if(books[i]==userbook){
                books[i]=" ";
                essuedbook[i]=userbook;
            }
        }
    }
    public void returnbook(){
        System.out.println("which book you want to return");
        Scanner sc = new Scanner(System.in);
        String uinput = sc.next();
        int i;
        for(i=0;i<=4;i++){
            if(books[i]==" "){
                books[i]=uinput;
            }
        }
    }
    public void addbook(){
        System.out.println("add the book in the library");
        Scanner sc = new Scanner(System.in);
        String bname = sc.next();
        books[5] = bname;
        System.out.println("you added the book successfully");
    }
    public void availablebook(){
        System.out.println("available books are");
        int i;
        for(i=0;i<=5;i++){
            System.out.println(books[i]);
        }
    }
}
public class J33libraryEX {
    public static void main(String[] args) {
        library essue = new library();
        essue.books[0]="comedy";
        essue.books[1]="drama";
        essue.books[2]="romance";
        essue.books[3]="success";
        essue.books[4]="power";
        essue.issuedbook();
        essue.returnbook();
        essue.addbook();
        essue.availablebook();
    }
}
