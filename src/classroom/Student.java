
package classroom;
// I really had trouble understanding this challenge, I kind of understand how we are to parse a xml document
// with known parameters, but making one that is universal for any xml document is not something I think I
// know how to do. 

public class Student {
    private String pawprint = "";
    private String firstName = "";
    private String lastName = "";
    private double grade  = 0.0;
    private int id = 0;
    
    public Student() {
        
    }
    
    public Student(int id, String pawprint, String firstName, String lastName, double grade) {
        this.id = id;
        this.pawprint = pawprint;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setPawprint(String pawprint) {
        this.pawprint = pawprint;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    public int getId() {
        return id;
    }
    
    public String getPawprint() {
        return pawprint;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public double getGrade() {
        return grade;
    }
}
