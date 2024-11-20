package problem_1;

public class Student extends Person {
    protected String myIDNum;
    protected double myGPA;

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIDNum = idNum;
        myGPA = gpa;
    }

    public void setId(String idNum){
        myIDNum = idNum;
    }

    public void setGpa(double gpa){
        myGPA = gpa;
    }

    public String getId(){
        return("ID: " + this.myIDNum);
    }

    public String getGpa(){
        return("GPA: " + this.myGPA);
    }
}
