package Java102;

public class linex extends OS{
    private String dist;

    public linex()
    {
        super("linex","Unknown");
        this.dist="Unknown";
    }
    public linex(String virsion,String dist)
    {
        super("linex",virsion);
        this.dist=dist;
    }
    @Override
    public void printOsInfo()
    {
        super.printOsInfo();
        System.out.print("Dist : "+this.dist);
    }
}
