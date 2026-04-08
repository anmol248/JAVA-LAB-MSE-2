package sem2;

import java.util.ArrayList;
import java.util.List;

class Stu {
    private String name;
    private String course;
    private int id;

    public Stu(String name, String course, int id) {
    	super();
        this.name = name;
        this.course = course;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getId() {
        return id;
    }
}

public class StudentName {

    public static void main(String[] args) {

        
        List<Stu> students = new ArrayList<>();

        students.add(new Stu("Student1", "MCA", 1));
        students.add(new Stu("Student2", "MCA", 2));
        students.add(new Stu("Student3", "BCA", 3));
        students.add(new Stu("Student4", "BSC", 4));
        students.add(new Stu("Student5", "MSC", 5));

        for (Stu s : students) {
            System.out.println("ID = " + s.getId());
            System.out.println("Names = " + s.getName());
            System.out.println("Course = " + s.getCourse());
            
        }
    }
}
