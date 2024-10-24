package TaskThree;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> passedCourses1 = new ArrayList<>();
        passedCourses1.add("Math");
        passedCourses1.add("English");
        ArrayList<String> passedCourses2 = new ArrayList<>();
        passedCourses2.add("Java 1.0");

        ArrayList<String> canTeach1 = new ArrayList<>();
        canTeach1.add("Programming");
        ArrayList<String> canTeach2 = new ArrayList<>();
        canTeach2.add("Java 1.0");

        ArrayList<Person> personArrayList = new ArrayList<Person>();

        Student student1 = new Student("Peter", passedCourses1);
        Student student2 = new Student("Bob", passedCourses2);
        personArrayList.add(student1);
        personArrayList.add(student2);

        Teacher teacher1 = new Teacher("Tess", canTeach1);
        Teacher teacher2 = new Teacher("Jesper", canTeach2);
        personArrayList.add(teacher1);
        personArrayList.add(teacher2);


        for (Person p : personArrayList) {
            p.addCourse("Java 1.0");

        }

    }
}

