import db.DBHelper;
import models.Course;
import models.Student;

public class Runner {

    public static void main(String[] args) {

        Course codeClan = new Course("Java 101", "PDA");
        DBHelper.save(codeClan);

        Student dan = new Student("Dan", 26, 1, course);
        DBHelper.save(dan);
        Student chris = new Student("Chris", 29, 2, course);
        DBHelper.save(chris);


    }
}
