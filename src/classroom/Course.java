
package classroom;

import java.util.ArrayList;

// I really had trouble understanding this challenge, I kind of understand how we are to parse a xml document
// with known parameters, but making one that is universal for any xml document is not something I think I
// know how to do. 
public class Course {
    private ArrayList<Student> students;
    
    public Course() {
        students = new ArrayList<>();
    }
    
    public ArrayList<Student> getStudents() {
        return students;
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
}
