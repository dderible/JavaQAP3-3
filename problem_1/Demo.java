package problem_1;

public class Demo {
    public static void main(String[] args) {
        Person Declan = new Person("Declan", 21, "M");
        System.out.println("Person: " + Declan);

        Student Cooper = new Student("Cooper", 20, "F", "NL709", 3.0);
        System.out.println("Student: " + Cooper);

        Teacher MsMalik = new Teacher("Mrs. Malik", 30, "F", "Java", 100000);
        System.out.println("Teacher: " + MsMalik);

        CollegeStudent Quentin = new CollegeStudent("Quentin", 22, "M", "NL710", 3.7, "Coding", 2);
        System.out.println("College Student: " + Quentin);
    }
}
