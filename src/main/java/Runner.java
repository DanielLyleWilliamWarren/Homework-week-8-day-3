import db.DBCourse;
import db.DBHelper;
import db.DBMentor;
import db.DBStudent;
import models.Course;
import models.Lesson;
import models.Mentor;
import models.Student;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Course codeClan = new Course("Java 101", "PDA");
        DBHelper.save(codeClan);

        Mentor john = new Mentor("john");
        DBHelper.save(john);
        Mentor zsolt = new Mentor("zsolt");
        DBHelper.save(zsolt);


        Student dan = new Student("Dan", 26, 1, codeClan, john);
        DBHelper.save(dan);
        Student chris = new Student("Chris", 29, 2, codeClan, zsolt);
        DBHelper.save(chris);


        Lesson java = new Lesson("Intro to Java", 3, codeClan);
        DBHelper.save(java);
        Lesson ruby = new Lesson("Intro to Ruby", 3, codeClan);
        DBHelper.save(ruby);

        List<Student> students =DBHelper.getAll(Student.class);
        List<Lesson> lessons = DBHelper.getAll(Lesson.class);

        List<Student> studentsOnCourse = DBCourse.getStudentsForCourse(codeClan);

        List<Lesson> lessonsOnCourse = DBCourse.getLessonsForCourse(codeClan);

        Student foundStudent = DBMentor.getStudentForMentor(john);

    }
}
