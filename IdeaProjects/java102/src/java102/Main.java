package Java102;


import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JFrame;

public class Main {
    public static void printOs(OS os)
    {
        os.printOsInfo();
    }

    public static void main(String[] args) {


        Windows win7 = new Windows("7");
        Mac lion = new Mac("Lion");
        linex uponto = new linex("10","uponto");
        win7.printOsInfo();
        lion.printOsInfo();
        uponto.printOsInfo();

    }
}