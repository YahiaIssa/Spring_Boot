package Java102;

/*
 * This class is used to hold student information.
 */
public class Student {

    /* student id */
    private int id;

    /* student name */
    private String name;

    /* student age */
    private int age;

    /* student department at the university */
    private String departmint;

    /* student GPA */
    private float gpa;

    /*
     * Default constructor
     * Initializes student data with default values
     */
    public Student() {
        this.id = 0;
        this.name = "Non";
        this.age = 0;
        this.departmint = "Non";
        this.gpa = 0.0f;
    }

    /*
     * Constructor with full parameters
     * Used to initialize all student data
     */
    public Student(int pid, String pname, int page, String pdepartmint, float pgpa) {
        this.id = pid;
        this.name = pname;
        this.age = page;
        this.departmint = pdepartmint;
        this.gpa = pgpa;
    }

    /*
     * Constructor with name only
     * Other values are set to default
     */
    public Student(String pname) {
        this.id = 0;
        this.name = pname;
        this.age = 0;
        this.departmint = "Non";
        this.gpa = 0.0f;
    }

    /* Set student id */
    public void setId(int pid) {
        this.id = pid;
    }

    /* Get student id */
    public int getID() {
        return this.id;
    }

    /* Set student name */
    public void setName(String pname) {
        this.name = pname;
    }

    /* Get student name */
    public String getName() {
        return this.name;
    }

    /* Set student age */
    public void setAge(int page) {
        this.age = page;
    }

    /* Get student age */
    public int getAge() {
        return this.age;
    }

    /* Set student department */
    public void setDepartmint(String pdepartmint) {
        this.departmint = pdepartmint;
    }

    /* Get student department */
    public String getDepartmint() {
        return this.departmint;
    }

    /* Set student GPA */
    public void setGPA(float pgpa) {
        this.gpa = pgpa;
    }

    /* Get student GPA */
    public float getGPA() {
        return this.gpa;
    }

    /*
     * Print all student information
     */
    public void printStudentinfo() {
        assert this.id !=0: this.name+"id is Error";
        System.out.println("___________(" + this.id + ") " + this.name + " information ___________");
        System.out.println("Age: " + this.age);
        System.out.println("Department: " + this.departmint);
        System.out.println("GPA: " + this.gpa);
    }
}
