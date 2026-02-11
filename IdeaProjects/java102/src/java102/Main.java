package java102;

public class Main {
    public static void main(String[] args){
     A x=new A();
     A y=new A(10);
        System.out.println(x.val);
        System.out.println(y.val);
        B c=new B();
        System.out.println(c.val);
    }
}