package Java102;

public class OS {
    private String name;
    private String Virsion;
    public OS(){
    this.name="none";
    this.Virsion="none";
    }
    public OS(String osname,String osvirsion){
        this.name=osname;
        this.Virsion=osvirsion;
    }
    public void printOsInfo()
    {
        System.out.println("OS : "+this.name+"Virsion : "+this.Virsion);
    }

}
