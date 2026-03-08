package Java102;

public class Calcuator {
    public static double add(double x, double y) {
        return x + y;
    }

    public static double Sup(double x, double y)
    {
        return x-y;
    }
    public static double Div(double x,double y) throws ArithmeticException
    {
       if (y==0)
            throw  new ArithmeticException();
        return x/y;
    }
    public static double mul (double x,double y)
    {
        return x*y;
    }
}
