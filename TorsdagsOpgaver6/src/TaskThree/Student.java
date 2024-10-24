package TaskThree;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student extends Person{

    ArrayList<String> passedCourses = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();
    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = new ArrayList<>();

    }

    @Override
    public boolean addCourse(String course) {
        if(passedCourses.contains(course)){
            System.out.println(getName() + " har allerede bestået dette kursus.");
            return false;
        }else {
            currentCourses.add(course);
            System.out.println(getName() + " er tilmeldt kurset " + course);
            return true;
        }

    }
}
