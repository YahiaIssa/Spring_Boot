package javacourse;


import java.util.Arrays;
import java.util.Locale;

public class First {

    public static void main(String[] args) {
       Book java_book=new Book("java","Yahia",2012,512);
       Book python_book=new Book("python","Hamzeh",2015,650);


       StrOp str=new StrOp(python_book.author);
       char ch[]=str.strToArray();
        System.out.println(ch);


       java_book.OpenBook();
       python_book.OpenBook();
       java_book.printBookInfo();

        System.out.println("___________________________");

       python_book.printBookInfo();
       java_book.CloseBook();
       python_book.CloseBook();
    }

}
